package org.vir;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> peloton = List.of(new Car("BMW"), new truck("volvo"), new motorbike("honda"));
        Race carrera = new Race(peloton);
        carrera.starRace();
    }
}


/*
        //polimorfismo: un metodo que hace start() a una carrera de vehiculos-> todos los vehiculos empiezan a acelerar
        List<Vehicle> peloton = List.of(new Car( marca:"BMW" ), new truck( marca: "volvo" ), new motorbike( marca:"honda" ));
        starRace(peloton);

        public static void starRace(List<Vehicle>peloton){
            for (Vehicle vehicle : peloton){
                vehicle.accelerar();
                System.out.println(vehicle);
            }
        }*/




