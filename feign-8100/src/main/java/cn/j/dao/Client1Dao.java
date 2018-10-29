package cn.j.dao;

import cn.j.dao.hystric.Client1Hystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author J
 * @time 2018/1/21 22:38
 * @description
 **/
// fallback  指定断路器
@FeignClient(value = "client-1", fallback = Client1Hystric.class)
public interface Client1Dao {
    @RequestMapping(value = "/client1/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam("name") String name);
}