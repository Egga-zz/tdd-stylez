package de.egga.chicago;

import de.egga.common.Character;
import de.egga.common.Planet;

import java.util.ArrayList;
import java.util.List;

public class ResistanceApp {

    public List<Character> searchForLuke(Planet planet) {
        List<Character> candidates = new ArrayList<>();

        for (Character citizen : planet.getCitizens()) {
            if (citizen.isHuman() && citizen.isJedi()) {
                candidates.add(citizen);
            }
        }

        return candidates;
    }
}
