package de.egga.common;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    private List<Being> citizens = new ArrayList<>();

    public void add(Being being) {
        citizens.add(being);
    }

    public List<Being> getCitizens() {
        return citizens;
    }
}
