package de.egga.common;

import static de.egga.common.Species.HUMAN;

public class CharacterFactory {

    static Character defaultHuman() {
        return new Character(HUMAN, "Rey");
    }

    static Character trainedHuman() {
        Character character = defaultHuman();
        character.train();
        return character;
    }

    static Character humanNamed(String name) {
        return new Character(HUMAN, name);
    }

    public static Character hanSolo() {
        return new Character(HUMAN, "Han Solo");
    }

    public static Character chewie() {
        Character chewie = new Character(Species.WOOKIE, "Chewbacca");
        chewie.train();
        return chewie;
    }

    public static Character luke() {
        Character luke = new Character(HUMAN, "Luke");
        luke.train();
        return luke;
    }
}
