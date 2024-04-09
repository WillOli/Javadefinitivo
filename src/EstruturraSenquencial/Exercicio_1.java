package EstruturraSenquencial;
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma;

        num1 = input.nextInt();
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println("SOMA = " + soma);

        input.close();

    }
}
