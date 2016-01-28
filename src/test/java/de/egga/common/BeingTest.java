package de.egga.common;

import org.junit.Test;

import static de.egga.common.BeingFactory.defaultHuman;
import static de.egga.common.BeingFactory.humanNamed;
import static de.egga.common.Species.HUMAN;
import static de.egga.common.Species.WOOKIE;
import static org.assertj.core.api.Assertions.assertThat;


public class BeingTest {

    @Test
    public void human_should_be_human() {
        Being being = humanNamed("Han Solo");
        boolean isHuman = being.isHuman();
        assertThat(isHuman).isTrue();
    }

    @Test
    public void wookie_should_not_be_human() {
        Being being = new Being(WOOKIE, "Chewbacca");
        boolean isHuman = being.isHuman();
        assertThat(isHuman).isFalse();
    }

    @Test
    public void untrained_should_be_weak_with_force() {
        Being being = defaultHuman();
        boolean isStrongWithForce = being.isStrongWithForce();
        assertThat(isStrongWithForce).isFalse();
    }

    @Test
    public void trained_should_be_strong_with_force() {
        Being being = BeingFactory.trainedHuman();
        boolean isStrongWithForce = being.isStrongWithForce();
        assertThat(isStrongWithForce).isTrue();
    }

    @Test
    public void luke_should_be_called_luke() {
        Being luke = humanNamed("Luke");
        boolean isCalledLuke = luke.isCalled("Luke");
        assertThat(isCalledLuke).isTrue();
    }

    @Test
    public void vader_should_not_be_called_luke() {
        Being luke = humanNamed("Darth Vader");
        boolean isCalledLuke = luke.isCalled("Luke");
        assertThat(isCalledLuke).isFalse();
    }

    @Test
    public void everybody_should_have_a_name() {
        Being unnamed = new Being(HUMAN);
        boolean hasDefaultName = unnamed.isCalled("FN 2187");
        assertThat(hasDefaultName).isTrue();
    }

    @Test
    public void null_name_should_get_default_name() {
        Being unnamed = humanNamed(null);
        boolean hasDefaultName = unnamed.isCalled("FN 2187");
        assertThat(hasDefaultName).isTrue();
    }

    @Test
    public void empty_name_should_get_default_name() {
        Being unnamed = humanNamed("");
        boolean hasDefaultName = unnamed.isCalled("FN 2187");
        assertThat(hasDefaultName).isTrue();
    }
}
