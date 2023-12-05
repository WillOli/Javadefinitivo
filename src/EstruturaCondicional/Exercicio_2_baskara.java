package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.*/

public class Exercicio_2_baskara {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in).useLocale(Locale.UK);

        System.out.println("Digite os coeficientes da equação de segundo grau. ");
        System.out.print("a: ");
        double a = input.nextDouble();

        System.out.print("b: ");
        double b = input.nextDouble();

        System.out.print("c: ");
        double c = input.nextDouble();

        // Calcula o discriminante
        double delta = b * b - 4 * a * c;

        // Verifica se a equação possui raízes reais
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("x1 = %.4f", x1);
            System.out.println("");
            System.out.printf("x2 = %.4f", x2);
        }else {
            System.out.println("Esta equação não possiu raízes reais.");
        }
        input.close();

    }
}
