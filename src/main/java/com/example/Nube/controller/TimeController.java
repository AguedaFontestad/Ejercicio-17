package com.example.Nube.controller;

import com.example.Nube.service.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * controller
 */
@Controller
public class TimeController {


    @Autowired
    private TimeService ts;


    @GetMapping("/time")
    @ResponseBody
    public String hola() {
        return ts.time();
    }

}