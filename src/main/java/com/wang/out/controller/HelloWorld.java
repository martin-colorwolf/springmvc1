package com.wang.out.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Martin.Wang on 2017/7/20.
 */
@Controller
public class HelloWorld {

    /*
    *
    * 1、使用@RequestMapping 注解来映射请求URL
    * 2、返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver视图解析器，会做如下的解析
    * 通过 prefix + returnVal + 后缀 这样的方式得到实际的物理视图，然后会做转发操作
    *
    * /success.jsp
    *
    * */
    @RequestMapping("/helloworld")
    public  String hello(){
        System.out.println("hello world");
        return "success";
    }

}
