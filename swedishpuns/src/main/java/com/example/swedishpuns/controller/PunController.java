package com.example.swedishpuns.controller;

import com.example.swedishpuns.model.SwedishPun;
import com.example.swedishpuns.service.PunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PunController {
    private final PunService punService;

    @Autowired
    public PunController(PunService punService) {
        this.punService = punService;
        this.punService.createPuns(); // Fyller punList med ordvitsar
    }

    @GetMapping("/random")
    public SwedishPun swedish_pun(Model model) {
        SwedishPun pun = punService.getPun();
        if (pun != null) {
            return pun;

        }
        return null;
    }
    }
