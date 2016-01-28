package de.egga.common;

public class PlanetFactory {

    public static Planet planetWith(Character luke) {
        Planet planet = new Planet();
        planet.add(luke);
        return planet;
    }
}
