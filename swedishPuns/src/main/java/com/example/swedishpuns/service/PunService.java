package com.example.swedishpuns.service;

import com.example.swedishpuns.model.SwedishPun;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PunService {
    public List<SwedishPun> punList;

    Random rand = new Random();
    public void createPuns() {
        List<SwedishPun> list = new ArrayList<>();
        list.add(new SwedishPun("Vad kallar man en skillsmässa i göteborg?","Päronsplitt"));
        list.add(new SwedishPun("Hur vet man att en dykare har drunknat?", "Han dycker inte upp"));
        list.add(new SwedishPun("Vilket djur flyger rakast?","Antiloop"));
        list.add(new SwedishPun("Vad kallar man en groda utan ben?", "Hopplös"));
        list.add(new SwedishPun("Hur löser dyckare svårighter?","Dom går till botten med problemet"));
        list.add(new SwedishPun("Varför fick björnen sova ute hela vintern?","Han hade tappat sitt ID-kort"));

        punList = list;
    }



    public SwedishPun getPun() {
        int random = rand.nextInt(punList.size());
        return punList.get(random);
    }

}
