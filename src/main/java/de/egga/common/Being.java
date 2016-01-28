package de.egga.common;

import static de.egga.common.Species.HUMAN;

public class Being {

    private final Species species;
    private boolean isStrongWithForce = false;

    public Being(Species species) {
        this.species = species;
    }

    public void train() {
        isStrongWithForce = true;
    }

    public boolean isHuman() {
        return species == HUMAN;
    }

    public boolean isStrongWithForce() {
        return isStrongWithForce;
    }
}
