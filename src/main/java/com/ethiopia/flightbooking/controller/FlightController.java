package com.ethiopia.flightbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlightController
{

    @GetMapping(value = {"/","/flightbooking", "/flightbooking/home"})
    public String home()
    {
        return "index";
    }


}
