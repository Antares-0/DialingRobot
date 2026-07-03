package cn.lxm.DialingRobotWeb;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        PersistenceExceptionTranslationAutoConfiguration.class,
})
@EnableDubbo
@EnableDiscoveryClient
public class DialingRobotWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DialingRobotWebApplication.class, args);
    }
}