package EstruturaCondicional;

import java.util.Scanner;
/*Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
números lidos. Em caso de empate, mostrar apenas uma vez.*/

public class Exercicio_3_menor_de_tres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3, menor;


        System.out.print("Primeiro valor: ");
        numero1 = input.nextInt();

        System.out.print("Segundo valor: ");
        numero2 = input.nextInt();

        System.out.print("Terceiro valor: ");
        numero3 = input.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        }
        if (numero2 < numero3) {
            menor = numero2;
        }else {
            menor = numero3;
        }

        System.out.println("MENOR = " + menor);

        input.close();

    }
}
