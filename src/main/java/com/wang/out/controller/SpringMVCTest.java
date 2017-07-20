package com.wang.out.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import test.wang.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {




    @RequestMapping("/testPojo")
    public String testPojo(User user, HttpServletRequest request){
        Map<String,String[]> dataMap =  request.getParameterMap();
        System.out.println("我是dataMap   " + dataMap.get("username")[0]);
        String name = request.getParameter("username");
        System.out.println(name);
        System.out.println("testPojo  " + user);
        return "success";
    }

    /*
    *
    * @RequestMapping 来映射请求参数。
    * value 值即请求参数的参数名
    * required 该参数是否必须。默认为true
    * defaultValue 请求参数的默认值
    *
    *
    * @RequestHeader 用法同 @RequestMapping 相同
    *
    * */
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String username,@RequestParam(value = "age",required = false,defaultValue = "0") Integer age){
        System.out.println("testRequestParam, username=  " + username + "  age=  " + age);
        return "success";
    }

    /*
    * @PathVariable 可以来映射URL 中的占位符到目标方法的参数中
    *
    * */
    @RequestMapping(value = "/testPathVariabel/{id}")
    public String testPathVariabel(@PathVariable(value = "id") Integer id){
        System.out.println("testPathVariabel" + id);
        return "success";
    }

    /*
    * 常用： 使用Method属性来指定请求方式
    * */
    @RequestMapping(value = "/testMethod" ,method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return "success";
    }

    /*
    * 1、@RequestMapping除了可以修饰方法还可以修饰类
    * 2、类定义处相对于根目录，方法定义处相对于类
    * */
    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return "success";
    }

    /*
    * Rest 风格的URL
    * 以CRUD为例：
    * 新增：/oder POST
    * 修改：/oder/1 PUT  update?id=1
    * 获取：/oder/1 GET  get?id=1
    * 删除：/oder/1 DELETE  delete?id=1
    *
    * 如何发送PUT 请求和DELETE请求呢？
    * 1、需要配置HiddenHttpMethodFilter
    * 2、需要发送 POST 请求
    * 3、需要在发送POST 请求是写到一个 name="_method" 的隐藏域，值为 DELETE 或 PUT
    * */

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
    public String testRestPut(@PathVariable(value = "id") Integer id){
        System.out.println("testRest  PUT:" + id);
        return "success";
    }


    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.DELETE)
    public String testRestdelete(@PathVariable(value = "id") Integer id){
        System.out.println("testRest  DELETE:" + id);
        return "success";
    }

    @RequestMapping(value = "/testRest",method = RequestMethod.POST)
    public String testRest(){
        System.out.println("testRest  POST");
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public String testRest(@PathVariable(value = "id") Integer id){
        System.out.println("testRest  GRT:" + id);
        return "success";
    }

    /*
    *
    * 了解 ：Ant路径写法，params 和 headers用法
    * */
    @RequestMapping(value = "testParamsHeaders/*",params = {"name","age != 10"},headers = {"User-Agent=123"})
    public String testParamsHeaders(){

        return "success";
    }

}
