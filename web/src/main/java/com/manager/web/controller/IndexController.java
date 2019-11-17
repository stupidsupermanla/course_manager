package com.manager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hudi
 * @Date 2018/12/22 16:58
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
