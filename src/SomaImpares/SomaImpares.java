package SomaImpares;

import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int x, y, troca, soma;

        System.out.println("Digite dois números:");
        x = input.nextInt();
        y = input.nextInt();

        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }
        soma = 0;
        for (int i = x+1; i < y; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println("Soma dos impares igual: " + soma);

        input.close();

    }
}
