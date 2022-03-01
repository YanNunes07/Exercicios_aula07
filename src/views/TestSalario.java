package views;

import model.Salario;

import java.util.Scanner;

public class TestSalario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Salario salario = new Salario();


        System.out.println("Digite o valor do Salário: ");
        salario.salario = ler.nextDouble();
        System.out.println(salario.mostrarDados());
    }
}
