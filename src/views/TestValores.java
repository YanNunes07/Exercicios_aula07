package views;

import model.Valores;

import java.util.Scanner;

public class TestValores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Valores v1 = new Valores();

        System.out.println("Digite o valor");
        v1.valoresReajuste = ler.nextDouble();

        System.out.println(v1.mostarDados());
    }
}
