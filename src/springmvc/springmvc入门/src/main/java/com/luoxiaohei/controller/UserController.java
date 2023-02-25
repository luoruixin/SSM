package com.luoxiaohei.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//springmvc使用@Controller定义bean(spring用的是@Component)
@Controller
public class UserController {
    //设置当前操作的访问路径
    @RequestMapping("/save")
    //设置当前操作的返回值类型
    @ResponseBody  //ResponseBody多用于处理json格式的数据
    public String save(){
        System.out.println("user save...");
        return "{'module':'springmvc'}";
    }
}
