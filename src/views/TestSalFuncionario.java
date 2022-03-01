package views;

import model.SalFuncionario;

import java.util.Scanner;

public class TestSalFuncionario {
    Scanner ler = new Scanner(System.in);
    SalFuncionario sl = new SalFuncionario();

    System.out.println("Digite o valor do Salário: ");
    sl.salario = ler.nextDouble();
}
