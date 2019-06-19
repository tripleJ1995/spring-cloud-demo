package cn.boottomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class BootTomcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootTomcatApplication.class, args);
    }


    @RequestMapping(value = "/tomcat" ,method = RequestMethod.POST)
    public String postParse(HttpServletRequest request){
        System.out.println(request.getParameter("name"));
        return request.getParameter("name");
    }
}
