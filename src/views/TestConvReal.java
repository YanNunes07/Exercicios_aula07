package views;

import model.ConversaoReal;

import java.util.Scanner;

public class TestConvReal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ConversaoReal cv = new ConversaoReal();

        System.out.println("Valor em R$:");
        cv.valorReal = ler.nextInt();

        System.out.println("Valor em dolar:" +cv.calcularValorDolar());
        System.out.println("Valor em Euro:" +cv.calacularValorEmEuro());
    }
}
