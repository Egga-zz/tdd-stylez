package de.egga.common;

import org.junit.Test;

import static de.egga.common.CharacterFactory.defaultHuman;
import static de.egga.common.CharacterFactory.humanNamed;
import static de.egga.common.Species.HUMAN;
import static de.egga.common.Species.WOOKIE;
import static org.assertj.core.api.Assertions.assertThat;


public class CharacterTest {

    @Test
    public void human_should_be_human() {
        Character character = humanNamed("Han Solo");
        boolean isHuman = character.isHuman();
        assertThat(isHuman).isTrue();
    }

    @Test
    public void wookie_should_not_be_human() {
        Character character = new Character(WOOKIE, "Chewbacca");
        boolean isHuman = character.isHuman();
        assertThat(isHuman).isFalse();
    }

    @Test
    public void untrained_should_be_weak_with_force() {
        Character character = defaultHuman();
        boolean isStrongWithForce = character.isStrongWithForce();
        assertThat(isStrongWithForce).isFalse();
    }

    @Test
    public void trained_should_be_strong_with_force() {
        Character character = CharacterFactory.trainedHuman();
        boolean isStrongWithForce = character.isStrongWithForce();
        assertThat(isStrongWithForce).isTrue();
    }

    @Test
    public void luke_should_be_called_luke() {
        Character luke = humanNamed("Luke");
        boolean isCalledLuke = luke.isCalled("Luke");
        assertThat(isCalledLuke).isTrue();
    }

    @Test
    public void vader_should_not_be_called_luke() {
        Character luke = humanNamed("Darth Vader");
        boolean isCalledLuke = luke.isCalled("Luke");
        assertThat(isCalledLuke).isFalse();
    }

    @Test
    public void everybody_should_have_a_name() {
        Character unnamed = new Character(HUMAN);
        boolean hasDefaultName = unnamed.isCalled("FN 2187");
        assertThat(hasDefaultName).isTrue();
    }

    @Test
    public void null_name_should_get_default_name() {
        Character unnamed = humanNamed(null);
        boolean hasDefaultName = unnamed.isCalled("FN 2187");
        assertThat(hasDefaultName).isTrue();
    }

    @Test
    public void empty_name_should_get_default_name() {
        Character unnamed = humanNamed("");
        boolean hasDefaultName = unnamed.isCalled("FN 2187");
        assertThat(hasDefaultName).isTrue();
    }
}
