package com.example.demo;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018-4-21.
 */
@RestController
public class HiController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        System.out.println("HiController--hi");
        return helloService.hiService(name);

    }
}
