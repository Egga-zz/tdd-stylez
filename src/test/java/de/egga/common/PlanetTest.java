package de.egga.common;

import org.junit.Test;

import static de.egga.common.Species.HUMAN;
import static org.assertj.core.api.Assertions.assertThat;


public class PlanetTest {

    Planet planet = new Planet();

    @Test
    public void it_should_add_and_return_character() {
        Character hanSolo = new Character(HUMAN, "Han Solo");
        planet.add(hanSolo);
        assertThat(planet.getCitizens()).containsExactly(hanSolo);
    }
}
