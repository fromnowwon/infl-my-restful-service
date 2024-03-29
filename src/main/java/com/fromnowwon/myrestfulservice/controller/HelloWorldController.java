package com.fromnowwon.myrestfulservice.controller;

import com.fromnowwon.myrestfulservice.controller.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET

    // URI - /hello-world

    // @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    @GetMapping(path="/hello-world")
    public String helloworld() {
        return "Hello world";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloworldBean() {
        return new HelloWorldBean("Hello World!!");
    }

    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
