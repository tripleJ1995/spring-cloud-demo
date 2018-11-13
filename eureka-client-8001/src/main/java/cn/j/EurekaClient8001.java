package cn.j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@tk.mybatis.spring.annotation.MapperScan(basePackages = {"cn.j"})
public class EurekaClient8001 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient8001.class, args);
	}
}
