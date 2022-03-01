package model;

public class ConversaoReal {
    public double valorReal;


    public double calcularValorDolar(){
        return this.valorReal / 5.17;
    }

    public double calacularValorEmEuro(){
        return this.valorReal / 6.14;
    }

    public String mostarDados(){
        return "\nValor do real: "+this.valorReal+
                "\nValor em dolar: "+this.calcularValorDolar()+
                 "\nValor em Euro: "+this.calacularValorEmEuro();
    }
}
