package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //只支持Eureka
//@EnableDiscoveryClient  可以作为其他的服务发现组件zk or Consul
public class MicroserviceroviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceroviderUserApplication.class, args);
	}
}
