package com.nhnacademy.springmvc.controller;

import java.util.Date;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NowController {
    @GetMapping("/now")
    public String now(Map<String, String> model){
        model.put("time",new Date().toString());
        return "now";
    }
}
