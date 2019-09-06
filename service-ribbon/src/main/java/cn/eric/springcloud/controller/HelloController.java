package cn.eric.springcloud.controller;

import cn.eric.springcloud.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Eric
 * @version 1.0
 * @ClassName: HelloController
 * @Description: TODO
 * @company lsj
 * @date 2019/7/18 18:09
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    HelloService helloService;

    @GetMapping("/hi")
    public String hello(){
        return helloService.hiService("mia");
    }

}
