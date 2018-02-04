package com.wang.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/2/2 0002.
 */
@Configuration
@RibbonClient(name = "microservice-provider-user", configuration = TestConfiguration.class)
public class RestTemplateConfig {

    @Bean
    @LoadBalanced  //整合了ribbon，使RestTemplate具备了负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
