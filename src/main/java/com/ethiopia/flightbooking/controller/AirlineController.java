package com.ethiopia.flightbooking.controller;

import com.ethiopia.flightbooking.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/airline")
public class AirlineController {

    @Autowired
    public AirlineService airlineService;

    @GetMapping(value = "index")
    public String getAirLines(Model model){
    model.addAttribute("airlines",airlineService.findAll());
    return "airline/index";
    }

}
