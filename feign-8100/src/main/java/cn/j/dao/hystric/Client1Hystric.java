package cn.j.dao.hystric;

import cn.j.dao.Client1Dao;
import org.springframework.stereotype.Component;

/**
 * @author J
 * @time 2018/10/29 20:11
 * @description
 **/
@Component
public class Client1Hystric implements Client1Dao {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name + ", net error";
    }
}
