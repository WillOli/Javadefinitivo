package Vetories;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N;
        double soma, media;

        System.out.print("Quantos números você vai digitar? ");
        N = input.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            vet[i] = input.nextDouble();
        }
        System.out.println();
        System.out.print("Valores = ");
        for(int i = 0; i< N; i++) {
            System.out.print(String.format("%.1f", vet[i]));
        }
        System.out.println();

        soma = 0;
        for (int i = 0; i < N; i++) {
            soma = soma + vet[i];
        }
        System.out.println("Soma = " + String.format("%.2f", soma));

        media = soma / N;
        System.out.println("Media = " + String.format("%.2f", media));

        input.close();
    }
}
