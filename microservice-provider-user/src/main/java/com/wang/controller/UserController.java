package com.wang.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.wang.entity.User;
import com.wang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 使用EurekaClient，获得注册到eureka上的微服务的URL
     *
     * result：http://192.168.2.100:7900/
     * @return
     */
    @GetMapping("/eureka-instance")
    public String serviceUrl() {
        //virtual host即是应用的名称microservice-provider-user
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("microservice-provider-user", false);
        return instance.getHomePageUrl();
    }

    /**
     * 使用DiscoveryClient，获得注册到eureka上的微服务的URL
     *
     * result：http://192.168.2.100:7900
     * @return
     */
    @GetMapping("/eureka-instance2")
    public String serviceUrl2() {
        List<ServiceInstance> list = discoveryClient.getInstances("microservice-provider-user");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;
    }

    /**
     * 获得注册到eureka上的微服务的信息
     *
     * result：{
     host: "192.168.2.100",
     port: 7900,
     metadata: { },
     secure: false,
     uri: "http://192.168.2.100:7900",
     serviceId: "microservice-provider-user",
     }
     * @return
     */
    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable("id") Long id){
        return userRepository.findOne(id);
    }


}
