package com.ethiopia.flightbooking.controller;

import com.ethiopia.flightbooking.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/airline")
public class AirlineController {

    @Autowired
    public AirlineService airlineService;

}
