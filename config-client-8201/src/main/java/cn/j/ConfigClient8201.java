package cn.j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ConfigClient8201 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient8201.class, args);
	}
	@Value("${foo}")
	String foo;
	@RequestMapping(value = "/demo/hi")
	public String hi(){
		return foo;
	}
}
