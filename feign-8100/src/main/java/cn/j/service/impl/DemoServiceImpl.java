package cn.j.service.impl;

import cn.j.service.DemoService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author J
 * @time 2018/1/21 23:00
 * @description
 **/
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHiFromClientOne(@RequestParam("name") String name) {
        return "sorry " + name;
    }
}
