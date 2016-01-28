package de.egga.common;

import static de.egga.common.Species.HUMAN;

public class BeingFactory {

    static Being defaultHuman() {
        return new Being(HUMAN, "Rey");
    }

    static Being trainedHuman() {
        Being being = defaultHuman();
        being.train();
        return being;
    }

    static Being humanNamed(String name) {
        return new Being(HUMAN, name);
    }

    public static Being hanSolo() {
        return new Being(HUMAN, "Han Solo");
    }

    public static Being chewie() {
        Being chewie = new Being(Species.WOOKIE, "Chewbacca");
        chewie.train();
        return chewie;
    }

    public static Being luke() {
        Being luke = new Being(HUMAN, "Luke");
        luke.train();
        return luke;
    }
}
