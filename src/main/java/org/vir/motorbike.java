package org.vir;

public class motorbike extends Vehicle{
    public motorbike(String marca) {
        super(marca);
        this.wheels = 8;
    }
    @Override
    public void acelerar(){
        this.velocity = 40;
    }


    @Override
    public String  toString(){

        return "The Motorbike va a: " + this.velocity + "km/h";
    }


}