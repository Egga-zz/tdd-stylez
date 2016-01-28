package de.egga.common;

import static de.egga.common.Species.HUMAN;
import static org.apache.commons.lang3.StringUtils.isEmpty;

public class Being {

    private static final String DEFAULT_NAME = "FN 2187";

    private final Species species;
    private final String name;
    private boolean isStrongWithForce = false;

    public Being(Species species) {
        this(species, null);
    }

    public Being(Species species, String name) {
        this.species = species;
        this.name = validateName(name);
    }

    private String validateName(String name) {
        if (isEmpty(name)) {
            return DEFAULT_NAME;
        } else {
            return name;
        }
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

    public boolean isCalled(String name) {
        return this.name.equals(name);
    }
}
