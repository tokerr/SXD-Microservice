package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018-4-21.
 */
@RestController
@RefreshScope//@RefreshScope，如果代码中需要动态刷新配置，在需要的类上加上该注解就行。但某些复杂的注入场景下，这个注解使用不当，配置可能仍然不动态刷新
public class ConfigClientController {

    @Value("${foo}")
    String foo;
    @Value("${server.port}")
    String port;

    @Value("${democonfigclient.message}")
    String message;


    @RequestMapping(value = "/hello")
    public String hi(){
        return foo+":"+port;
    }


    @RequestMapping(value = "/hello2")
    public String hi2(){
        return message;
    }

}
