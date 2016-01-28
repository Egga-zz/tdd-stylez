package de.egga.chicago;

import de.egga.common.Being;
import de.egga.common.Planet;
import org.junit.Test;

import java.util.List;

import static de.egga.common.BeingFactory.*;
import static de.egga.common.PlanetFactory.planetWith;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    Being luke = luke();
    Being chewie = chewie();
    Being han = hanSolo();

    App app = new App();

    @Test
    public void it_should_find_luke() {
        Planet planet = planetWith(luke);
        List<Being> candidates = app.searchPlanet(planet);
        assertThat(candidates).contains(luke);
    }

    @Test
    public void it_should_not_find_wookies() {
        Planet planet = planetWith(chewie);
        List<Being> candidates = app.searchPlanet(planet);
        assertThat(candidates).isEmpty();
    }

    @Test
    public void it_should_not_find_beings_weak_with_the_force() {
        Planet planet = planetWith(han);
        List<Being> candidates = app.searchPlanet(planet);
        assertThat(candidates).isEmpty();
    }
}