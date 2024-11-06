package org.vir;

import java.util.List;

public class Race {
    private List<Vehicle> peloton;

    public Race(List<Vehicle> peloton) {
        this.peloton = peloton;
    }


    public void starRace() {
        for (Vehicle vehicle : peloton) {
            vehicle.acelerar();
            System.out.println(vehicle);
        }
    }
}