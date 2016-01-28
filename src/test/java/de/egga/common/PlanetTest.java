package de.egga.common;

import org.junit.Test;

import static de.egga.common.Species.HUMAN;
import static org.assertj.core.api.Assertions.assertThat;


public class PlanetTest {

    Planet planet = new Planet();

    @Test
    public void it_should_add_and_return_living_being() {
        Being hanSolo = new Being(HUMAN);
        planet.add(hanSolo);
        assertThat(planet.getCitizens()).containsExactly(hanSolo);
    }
}
