package views;

import model.SalarioReajuste;

import java.util.Scanner;

public class TestReajuste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        SalarioReajuste SR = new SalarioReajuste();

        System.out.println("Digite o salario dos funcionarios:");
        SR.reajuste = ler.nextDouble();

        System.out.println(SR.mostarDados());
    }
}
