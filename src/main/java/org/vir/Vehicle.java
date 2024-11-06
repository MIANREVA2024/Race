package org.vir;

public abstract class Vehicle {
    //atributos
    private String marca;
    protected int velocity;
    protected int wheels;

    public Vehicle(String marca){
        this.marca = marca;
        this.velocity = 0;
    }

    public abstract void acelerar();



    /*metodos

    public String getMarca() {
        return marca;    }

    public int getVelocity() {
        return velocity;    }

    public int getWheels() {
        return wheels;    }*/
}
