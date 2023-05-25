package Vetories;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        /*Entrada dos dados*/
        System.out.print("Quantos numeros você vai digitar? ");
        N = sc.nextInt();
        /*Vetor que armazena os valores de N*/
        double[] vet = new double[N];
        /*Estrutura que verificar os valores de N*/
        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }
        /*Estrutura que verifica a quantidade digitada no vetor
        * com os valore armazenaodos em i*/
        System.out.println("\nNumeros digitados:");
        for (i = 0; i < N; i++) {
            System.out.println(String.format("%.1f", vet[i]));
        }

    }
}
