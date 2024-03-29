package com.nhnacademy.springmvc.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NowController {
    @GetMapping("/now")
    public String now(@RequestParam(name="name") String name, Model model){
        model.addAttribute("time",new Date().toString());
        model.addAttribute("name",name);
        return "now";
    }

    @GetMapping("/now/{nick}")
    public String now1(@RequestParam(name="name") String name,
                        @PathVariable(name="nick")String nick
                , Model model){
        model.addAttribute("time",new Date().toString());
        model.addAttribute("name",name);
        model.addAttribute("nick",nick);
        return "now";
    }
}
