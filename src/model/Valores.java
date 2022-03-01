package model;

public class Valores {
    public double valoresReajuste;


    public double valorComReajuste10(){
        return (valoresReajuste * 0.10)+valoresReajuste;
    }

    public double valorComReajuste1(){
        return (valoresReajuste * 0.01)+valoresReajuste;
    }

    public String mostarDados(){
        return "\nValor com 10%: "+valorComReajuste10()+
                "\nValor com 1%:"+valorComReajuste1();
    }
}
