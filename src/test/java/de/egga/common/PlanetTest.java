package de.egga.common;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class PlanetTest {

    Planet planet = new Planet();

    @Test
    public void it_should_add_and_return_person() {
        planet.add("Luke");
        List<String> citizens = planet.getCitizens();
        assertThat(citizens).contains("Luke");
    }
}
