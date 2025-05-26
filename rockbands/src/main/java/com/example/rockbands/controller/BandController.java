package com.example.rockbands.controller;

import com.example.rockbands.model.RockBand;
import com.example.rockbands.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BandController {
    private final BandService bandService;

    @Autowired
    public BandController(BandService rockBandService) {
        this.bandService = rockBandService;
        this.bandService.createBands(); // Fyller rockBandList med Rock band
    }

    @GetMapping("/random")
    public RockBand rock_band() {
        RockBand rockBand = bandService.getBand();
        if (rockBand != null) {
            return rockBand;
        }
        else return null;
    }
}
