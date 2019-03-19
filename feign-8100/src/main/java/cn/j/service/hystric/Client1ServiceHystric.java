package cn.j.service.hystric;

import cn.j.service.Client1Service;
import org.springframework.stereotype.Component;

/**
 * @author J
 * @time 2018/10/29 20:11
 * @description
 **/
@Component
public class Client1ServiceHystric implements Client1Service {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name + ", net error";
    }
}
