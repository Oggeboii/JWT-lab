package com.example.swedishpuns.controller;


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
    public String swedishPun(Model model) {
        String pun = punService.getPun().joke();
        String punchLine = punService.getPun().punchLine();
        model.addAttribute("pun", pun);
        model.addAttribute("punchLine", punchLine);
        return "swedish_pun";
    }


}
