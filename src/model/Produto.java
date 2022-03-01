package model;

public class Produto {
    public double valorDoProduto;

    public double calacularDesconto(){
        return (valorDoProduto * 0.10);
    }

    public double calcularJuros(){
        return (valorDoProduto * 0.15);
    }

    public double valorTotalComJuros(){
        return valorDoProduto+ calcularJuros();
    }

    public double valorTotalComDesconto(){
        return valorDoProduto - calacularDesconto();
    }



    public String mostarDados(){
        return "\nValor do produto: "+this.valorDoProduto+
                "\nValor do juros: "+this.calcularJuros()+
                "\nValor do desconto: "+this.calacularDesconto()+
                "\nValor total com juros: "+this.valorTotalComJuros()+
                "\nValor total com desconto: "+this.valorTotalComDesconto();
    }


}
