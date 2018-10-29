package cn.j.api;

import cn.j.dao.Client1Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author J
 * @time 2018/1/21 22:39
 * @description
 **/
@RestController
public class DemoApi {

    @Autowired
    private Client1Dao demoDao;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(String name) {
        return demoDao.sayHiFromClientOne(name);
    }
}
