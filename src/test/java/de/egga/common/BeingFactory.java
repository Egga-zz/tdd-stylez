package de.egga.common;

import static de.egga.common.Species.HUMAN;

public class BeingFactory {

    static Being defaultHuman() {
        return new Being(HUMAN, "Han Solo");
    }

    static Being trainedHuman() {
        Being being = defaultHuman();
        being.train();
        return being;
    }

    static Being humanNamed(String name) {
        return new Being(HUMAN, name);
    }
}
