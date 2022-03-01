package views;

import model.Produto;

import java.util.Scanner;

public class TestProduto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Valor do produto:");
        produto.valorDoProduto = ler.nextDouble();

        System.out.println(produto.mostarDados());


    }
}
