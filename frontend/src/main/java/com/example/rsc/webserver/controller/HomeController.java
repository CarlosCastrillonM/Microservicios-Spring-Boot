package com.example.rsc.webserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Login";
    }

    @RequestMapping("/newOffer")
    public String newOffer() {
        return "FormNewOffer";
    }

    @RequestMapping("/visualizeOffer")
    public String visualizeOffer() {
        return "VisualizerOfferClient";
    }
}
