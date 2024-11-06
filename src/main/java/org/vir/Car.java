package org.vir;

public class Car extends Vehicle{
    public Car(String marca) {
        super(marca);
        this.wheels = 4;
    }
    @Override
    public void acelerar(){

        this.velocity += 80;
    }


    @Override
    public String  toString(){

        return "El Car va a: " + this.velocity + "km/h";
    }


}