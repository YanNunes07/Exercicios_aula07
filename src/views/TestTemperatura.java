package views;

import model.Temperatura;

import java.util.Scanner;

public class TestTemperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Temperatura temp = new Temperatura();

        System.out.println("Digite a temperatura: ");
        temp.grausC = ler.nextDouble();

        System.out.println(temp.mostarDados());

    }
}
