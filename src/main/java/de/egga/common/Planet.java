package de.egga.common;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    private List<Character> citizens = new ArrayList<>();

    public void add(Character character) {
        citizens.add(character);
    }

    public List<Character> getCitizens() {
        return citizens;
    }
}
