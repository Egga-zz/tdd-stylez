package de.egga.common;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    private List<String> citizens = new ArrayList<String>();

    public void add(String name) {
        citizens.add(name);
    }

    public List<String> getCitizens() {
        return citizens;
    }
}
