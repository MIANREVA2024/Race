package org.vir;

public class truck extends Vehicle{
    public truck(String marca) {
        super(marca);
        this.wheels = 8;
    }
    @Override
    public void acelerar(){
            this.velocity = 60;
        }


        @Override
    public String  toString(){

        return "El truck va a: " + this.velocity + "km/h";
    }


}

