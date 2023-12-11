package EstruturaEnquanto;

import java.util.Locale;
import java.util.Scanner;
/*
* Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
programa deve finalizar quando forem digitados dois valores iguais.
* */
public class Exercicio_1_crescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int x,y;

        do {
            System.out.println("Digite dois números: ");
            x = input.nextInt();
            y = input.nextInt();

            if (x < y) {
                System.out.println("Crescente!");
            } else if ( x > y) {
                System.out.println("Decrescente!");
            } else {
                System.out.println("Iguais");
                break;
            }
        }while (true);

        input.close();

    }
}
