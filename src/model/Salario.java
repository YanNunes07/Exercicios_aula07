package model;

public class Salario {
    public double salario;

    public double calcularQntDeSalario(){
        return this.salario / 1100;
    }

    public String mostrarDados(){
        return "\nSalario do Funcionario "+this.salario+
                "\nQuantidade de Salários: "+this.calcularQntDeSalario();
    }
}
