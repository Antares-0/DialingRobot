package cn.lxm.dialingrobotweb;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
public class DialingRobotWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DialingRobotWebApplication.class, args);
    }
}