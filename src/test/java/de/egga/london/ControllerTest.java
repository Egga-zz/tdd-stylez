package de.egga.london;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

    @Mock
    Service service;

    @InjectMocks
    Controller controller;

    @Test
    public void it_should_collaborate() {
        when(service.receive()).thenReturn("Fetched value");
        String fetched = controller.receive();
        assertThat(fetched).isEqualTo("Fetched value");
    }

    @Test
    public void it_should_verify() {
        controller.send("some value");
        verify(service).send("some value");
    }
}