package model;

public class Temperatura {
    public double grausC;


    public double calcularTemperatura(){
        return (9 * grausC +160)/5;
    }

    public String mostarDados(){
        return "\nTemperatura em Celsius "+this.grausC+
                "\nTemperatura em Fahrenheit "+this.calcularTemperatura();
    }
}
