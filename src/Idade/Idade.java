package Idade;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os nomes
* e a idade média entre as pessoas, com uma casa decimal.*/
public class Idade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double media;

        System.out.println("Dados da primeira pessoa");
        System.out.print("Nome: ");
        nome1 = input.nextLine();
        System.out.print("Idade: ");
        idade1 = input.nextInt();

        System.out.println("Dados da segunda poessoa:");
        System.out.print("Nome: ");
        input.nextLine();
        nome2 = input.nextLine();
        System.out.print("Idade: ");
        idade2 = input.nextInt();

        media = (double) (idade1 + idade2) / 2;

        System.out.println("A media de idade de " + nome1 + " e " + nome2 + "é de " + media);




    }
}
