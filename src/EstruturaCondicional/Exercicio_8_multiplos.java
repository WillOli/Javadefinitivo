package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
números podem ser digitados em qualquer ordem.*/
public class Exercicio_8_multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int numero1, numero2;

        System.out.println("Digite dois numeros inteiros:");

        numero1 = input.nextInt();
        numero2 = input.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos.");
        }

    }
}
