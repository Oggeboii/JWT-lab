package com.example.swedishpuns.service;

import com.example.swedishpuns.model.SwedishPun;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PunService {
    public List<SwedishPun> punList;


    public List<SwedishPun> createPuns() {
        List<SwedishPun> list = new ArrayList<>();
        list.add(new SwedishPun("Vad kallar man en skillsmässa i göteborg","Päronsplitt"));
        list.add(new SwedishPun("Hur vet man att en dykare har drunknat", "Han dycker inte upp"));
        list.add(new SwedishPun("Vilket djur flyger rakast","Antiloop"));
        list.add(new SwedishPun("Vad kallar man en groda utan ben", "Hopplös"));

        punList = list;
        return punList;
    }

    public SwedishPun getPun() {
        int random = new Random().nextInt(punList.size());
        return punList.get(random);
    }

}
