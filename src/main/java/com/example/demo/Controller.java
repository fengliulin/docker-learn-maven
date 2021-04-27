package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@ResponseBody
public class Controller {

    @GetMapping("/hello")
    public String  A() {
        return "docker idea 部署测试";
    }

    @GetMapping("/hello1")
    public String  A1() {
        return "爱你爱啊";
    }
}
