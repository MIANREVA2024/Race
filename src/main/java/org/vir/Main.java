package org.vir;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> peloton = List.of(new Car("BMW"), new truck("volvo"), new motorbike("honda"));
        Race carrera = new Race(peloton);
        carrera.starRace();
    }
}
