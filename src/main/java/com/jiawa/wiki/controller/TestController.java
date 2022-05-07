package com.jiawa.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //返回一个字符串
//@Controller //表示返回一个页面
public class TestController {


    /**
     * GET ,POST ,PUT,DELETE
     *
     */
    //@RequestMapping("/hello")   //添加一个接口路径,RequestMapping 表示任何请求方式都支持接口的访问
    //@GetMapping("/hello")  //表示get方式的接口请求。
    //@PostMapping
    //@PutMapping
    //@DeleteMapping
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){
        return "hell world!!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello world post, " + name;
    }

    @PostMapping("/helloPost")
    public String hello1Post(String postName){
        return "hello post 2:" + postName;
    }
}


