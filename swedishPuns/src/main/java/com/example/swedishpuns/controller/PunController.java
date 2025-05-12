package com.example.swedishpuns.controller;

import com.example.swedishpuns.model.SwedishPun;
import com.example.swedishpuns.service.PunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PunController {
    private final PunService punService;

    @Autowired
    public PunController(PunService punService) {
        this.punService = punService;
        this.punService.createPuns(); // Fyller punList med ordvitsar
    }

    @GetMapping("/swedish_pun")
    public String swedish_pun(Model model) {
        SwedishPun pun = punService.getPun();
        if (pun != null) {
            model.addAttribute("pun", pun.joke());
            model.addAttribute("punchLine", pun.punchLine());
        } else {
            model.addAttribute("pun", "Ingen ordvits hittades.");
            model.addAttribute("punchLine", "");
        }
        return "swedish_pun";
    }
}
