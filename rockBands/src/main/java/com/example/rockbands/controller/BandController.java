package com.example.rockbands.controller;

import com.example.rockbands.model.RockBand;
import com.example.rockbands.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BandController {
    private final BandService bandService;

    @Autowired
    public BandController(BandService rockBandService) {
        this.bandService = rockBandService;
        this.bandService.createBands(); // Fyller rockBandList med Rock band
    }

    @GetMapping("/rock_band")
    public String rock_band(Model model) {
        RockBand rockBand = bandService.getBand();
        if (rockBand != null) {
            model.addAttribute("band", rockBand.name());
        }
        else model.addAttribute("band", "");
        return "rock_band";
    }
}
