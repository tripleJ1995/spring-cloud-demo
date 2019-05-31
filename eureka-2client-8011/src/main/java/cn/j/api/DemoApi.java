package cn.j.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author J
 * @time 2018/1/21 22:30
 * @description
 **/
@RestController
@RequestMapping(value = "/demo")
public class DemoApi {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(String name) {
        return "hi client - 2" + name + ",i am from port:" + port;
    }
}
