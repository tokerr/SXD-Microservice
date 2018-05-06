package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018-4-21.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;


    @RequestMapping(value = "/feign",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        System.out.println("HiController--sayHi");
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
