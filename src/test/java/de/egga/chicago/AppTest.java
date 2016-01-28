package de.egga.chicago;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void it_should_call_for_action() {
        App app = new App();
        String value = app.callForAction();
        assertThat(value).isEqualTo("Done.");
    }
}