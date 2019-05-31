package cn.j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@tk.mybatis.spring.annotation.MapperScan(basePackages = {"cn.j"})
public class Eureka2Client8011 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka2Client8011.class, args);
    }
}
