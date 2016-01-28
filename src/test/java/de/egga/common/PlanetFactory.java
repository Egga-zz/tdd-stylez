package de.egga.common;

public class PlanetFactory {

    public static Planet planetWith(Being luke) {
        Planet planet = new Planet();
        planet.add(luke);
        return planet;
    }
}
