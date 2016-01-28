package de.egga.common;

import org.junit.Test;

import static de.egga.common.Species.HUMAN;
import static de.egga.common.Species.WOOKIE;
import static org.assertj.core.api.Assertions.assertThat;


public class BeingTest {

    @Test
    public void human_should_be_human() {
        Being being = new Being(HUMAN);
        boolean isHuman = being.isHuman();
        assertThat(isHuman).isTrue();
    }

    @Test
    public void wookie_should_not_be_human() {
        Being being = new Being(WOOKIE);
        boolean isHuman = being.isHuman();
        assertThat(isHuman).isFalse();
    }

    @Test
    public void untrained_should_be_weak_with_force() {
        Being being = new Being(HUMAN);
        boolean isStrongWithForce = being.isStrongWithForce();
        assertThat(isStrongWithForce).isFalse();
    }

    @Test
    public void trained_should_be_strong_with_force() {
        Being being = new Being(HUMAN);
        being.train();
        boolean isStrongWithForce = being.isStrongWithForce();
        assertThat(isStrongWithForce).isTrue();
    }
}
