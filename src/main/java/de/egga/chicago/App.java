package de.egga.chicago;

import de.egga.common.Being;
import de.egga.common.Planet;

import java.util.ArrayList;
import java.util.List;

public class App {
    public List<Being> searchPlanet(Planet planet) {
        List<Being> candidates = new ArrayList<>();

        for (Being citizen : planet.getCitizens()) {
            if (citizen.isHuman() && citizen.isStrongWithForce()) {
                candidates.add(citizen);
            }
        }

        return candidates;
    }
}
