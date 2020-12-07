package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FreeStyleController
 * @Description TODO
 * @Author hk
 * @Date 2020/12/7 9:36
 */
@RestController
public class FreeStyleController {

    @RequestMapping("index")
    public String index() {
        return "FreeStyleController...";
    }
}
