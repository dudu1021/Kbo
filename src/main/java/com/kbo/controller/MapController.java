package com.kbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @GetMapping("/good-place")
    public String goodpage() {
        return "good.html";
    }
}
