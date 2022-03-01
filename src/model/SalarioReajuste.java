package model;

public class SalarioReajuste {
    public double reajuste;

    public double reajusteDosFuncionario(){
        return (reajuste * 0.20);
    }
    public double reajusteTotal(){
        return (reajuste * 0.20)+reajuste;
    }

    public String mostarDados(){
        return "\nValor do reajuste é de R$:"+reajusteDosFuncionario()+
                "\nO valor total ficara R$: "+reajusteTotal();
    }
}
