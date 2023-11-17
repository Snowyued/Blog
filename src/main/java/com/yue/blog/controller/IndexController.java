package com.yue.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yue
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    @ResponseBody
    public String Index(){

        return "hello";
    }
}
