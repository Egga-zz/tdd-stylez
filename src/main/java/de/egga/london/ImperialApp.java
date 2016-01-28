package de.egga.london;

import de.egga.common.Character;
import de.egga.common.Planet;

import java.util.List;

public class ImperialApp {

    private JediService jediService;
    private SpeciesService speciesService;

    public List<Character> searchForLuke(Planet planet) {
        List<Character> allCitizens = planet.getCitizens();
        List<Character> allJedi = jediService.filterJedi(allCitizens);
        List<Character> candidates = speciesService.filterHumans(allJedi);
        return null;
    }
}
