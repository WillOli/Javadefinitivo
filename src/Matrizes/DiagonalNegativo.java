package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N, cont;

        System.out.print("Qual a ordem da matriz? ");
        N = input.nextInt();

        /*Matriz*/
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println("Diagonal Principal");
        for (int i = 0; i < N; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        cont = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(mat[i][j] < 0) {
                    cont++;
                    // cont = cont + 1;
                }

            }
        }
        System.out.print("Quantidade de negativos = " + cont);
        input.close();
    }
}
