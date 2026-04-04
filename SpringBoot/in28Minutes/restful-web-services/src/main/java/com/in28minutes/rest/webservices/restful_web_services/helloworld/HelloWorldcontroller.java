package com.in28minutes.rest.webservices.restful_web_services.helloworld;

import com.in28minutes.rest.webservices.restful_web_services.HLO.HelloBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldcontroller {

    @GetMapping("/hello-world")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloBean helloFaizan(){
        return new HelloBean("Hello Faizan");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloBean helloPathVariable(@PathVariable String name){
        return new HelloBean("hello world, " + name);
    }

}
