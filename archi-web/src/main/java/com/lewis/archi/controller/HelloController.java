package com.lewis.archi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangminghua on 2016/8/23.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    @ResponseBody
    public String sayHello(String name){
        return "hello "+name;
    }
}
