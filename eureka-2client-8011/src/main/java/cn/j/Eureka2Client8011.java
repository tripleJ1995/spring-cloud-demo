package cn.j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eureka2Client8011 {

	public static void main(String[] args) {
		SpringApplication.run(Eureka2Client8011.class, args);
	}
}
