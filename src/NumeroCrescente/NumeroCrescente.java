package NumeroCrescente;

import java.util.Scanner;

public class NumeroCrescente {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y;
        System.out.println("Digite dois números: ");
        x = input.nextInt();
        y = input.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Crescente");
            }else {
                System.out.println("Decrescente");
            }
            System.out.println("Digite outros dois números: ");
            x = input.nextInt();
            y = input.nextInt();

        }
        input.close();

    }
}
