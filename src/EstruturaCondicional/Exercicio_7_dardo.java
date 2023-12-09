package EstruturaCondicional;

/*No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
foi a maior.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7_dardo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double distancia1, distancia2, distancia3;

        System.out.println("Digite a três distâncias: ");
        distancia1 = input.nextDouble();
        distancia2 = input.nextDouble();
        distancia3 = input.nextDouble();

        if (distancia1 > distancia2 && distancia1 > distancia3) {
            System.out.printf("Maior distância = %.2f = " , distancia1);
        }
        if (distancia2 > distancia1 && distancia2 > distancia3) {
            System.out.printf("Maior distância = %.2f" , distancia2);
        }else {
            System.out.printf("Maior distância = %.2f" , distancia3);
        }
    }
}
