package com.example.rockbands.service;

import com.example.rockbands.model.RockBand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BandService {

    public List<RockBand> bandList;

    Random rand = new Random();
    public void createBands() {
        List<RockBand> list = new ArrayList<>();
        list.add(new RockBand("Black Sabbath"));
        list.add(new RockBand("AC/DC"));
        list.add(new RockBand("Iron Maiden"));
        list.add(new RockBand("Sabaton"));
        list.add(new RockBand("InFlames"));
        list.add(new RockBand("Rainbow"));
        list.add(new RockBand("The Rolling Stones"));
        list.add(new RockBand("Led Zepplin"));
        list.add(new RockBand("Lynyrd Skynyrd"));
        list.add(new RockBand("Twisted Sister"));
        list.add(new RockBand("Red Hot Chili Peppers"));

        bandList = list;
    }

    public RockBand getBand() {
        int random = rand.nextInt(bandList.size());
        return bandList.get(random);
    }

}
