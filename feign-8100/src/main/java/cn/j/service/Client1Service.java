package cn.j.service;

import cn.j.service.hystric.Client1ServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author J
 * @time 2018/1/21 22:38
 * @description
 **/
// fallback  指定断路器
@FeignClient(value = "client-1", fallback = Client1ServiceHystrix.class)
public interface Client1Service {

    @RequestMapping(value = "/demo/hystrix", method = RequestMethod.GET)
    String testHystrix(@RequestParam("name") String name);
}