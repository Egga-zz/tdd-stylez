package de.egga.london;

public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void send(String value) {
        service.send(value);
    }

    public String receive() {
        return service.receive();
    }
}
