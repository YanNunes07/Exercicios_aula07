package views;

import model.ConversaoIdade;

import java.util.Scanner;

public class TestConversao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ConversaoIdade c1 = new ConversaoIdade();


        System.out.println("Digite a idade:");
        c1.idade = ler.nextInt();

        System.out.println("Idade:" +c1.idade);
        System.out.println("Idade em meses:" +c1.calacularIdadeEmMeses());
        System.out.println("Idade em semanas:" +c1.calcularIdadeEmSemanas());
        System.out.println("Idade em dias:" +c1.calacularIdadeEmDias());
        System.out.println("Idade em horas:" +c1.calacularIdadeEmHoras());
        System.out.println("Idade em minutos:" +c1.calcularIdadeEmMinutos());
        System.out.println("Idade em segundos:"+c1.calacularIdadeEmSegundos());

    }
}
