package EstruturaCondicional;

import java.util.Scanner;

/*Fazer um programa para ler a quantidade de glicose
no sangue de uma pessoa e depois mostrar na tela a
classificação desta glicose de acordo com a tabela de
referência ao lado.*/

public class Exercicio_6_glicose {
    public static void main(String[] args) {
        double quantidade;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        quantidade = input.nextDouble();

        if (quantidade <= 100) {
            System.out.println("Classificação:  Normal");
        }
        if (quantidade > 100 && quantidade <= 140.0) {
            System.out.println("Classificação: Elevado");
        }
        if (quantidade > 140.0) {
            System.out.println("Classificação: Diabetes");
        }
        input.close();
    }
}
