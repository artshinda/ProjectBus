package com.finalproject.syirfan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class registerController {
    @RequestMapping({"/signUp"})
    public String signUp() {

        return "signUp";
    }
}
