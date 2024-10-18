package com.example.rsc.controller;

import com.example.rsc.dto.OfertaDto;
import com.example.rsc.service.OfertaService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("main/offers")
public class MainOfferController {

    private final OfertaService offerService;

    public MainOfferController(@Qualifier("offerConnection") OfertaService offerService) {this.offerService = offerService;}

    @GetMapping("/")
    private List<OfertaDto> getOffers() {
        return offerService.findAll();
    }
}
