package cn.j.basedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@tk.mybatis.spring.annotation.MapperScan(basePackages = {"cn.j"})
@SpringBootApplication
public class BaseDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseDbApplication.class, args);
    }
}
