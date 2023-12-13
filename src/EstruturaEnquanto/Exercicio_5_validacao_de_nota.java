package EstruturaEnquanto;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
intervalo [0,10]). Cada nota deve ser validada separadamente.
*/
public class Exercicio_5_validacao_de_nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double nota1, nota2, media;

        while(true) {
            System.out.print("Digite a primeira nota: ");
            nota1 = input.nextDouble();

            if (nota1 >= 0 && nota1 <= 10 ) {
                break;
            }else {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        while(true) {
            System.out.print("Digite a segunda nota: ");
            nota2 = input.nextDouble();

            if (nota2 >= 0 && nota2 <= 10 ) {
                break;
            }else {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        media = (nota1 + nota2) / 2;
        System.out.printf("MEDIA: %.2f", media);
        input.close();

    }
}