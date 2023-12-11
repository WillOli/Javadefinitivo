package EstruturaCondicional;

/*Leia os valores das coordenadas X e Y de um ponto no plano
cartesiano. A seguir, determine qual o quadrante ao qual pertence o
ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
“Eixo X” ou “Eixo Y”, conforme for a situação.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11_coordenadas {
    public static void main(String[] args) {
        // Cria um scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicita ao usuário que insira as coordenadas X e Y
        System.out.print("Digite a coordenada X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite a coordenada Y: ");
        double y = scanner.nextDouble();

        // Identifica o quadrante, eixo ou origem ao qual o ponto pertence
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }

        // Fecha o scanner
        scanner.close();
    }
}
