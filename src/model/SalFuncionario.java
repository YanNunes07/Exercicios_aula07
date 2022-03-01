package model;

public class SalFuncionario {
    public double salarioFixo;
    public double valorVendas;

    public double calcularComissao(){
        return valorVendas * 0.04;
    }

    public double calcularSalarioFinal(){
        return (salarioFixo + calcularComissao());
    }
    public String mostarDados(){
        return "\nSalario fixo R$: "+ this.salarioFixo+
                "\nComissao é de R$: "+this.calcularComissao()+
                "\nSalario final é de R$: "+this.calcularSalarioFinal();
    }
}
