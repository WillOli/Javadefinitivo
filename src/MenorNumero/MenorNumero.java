package MenorNumero;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, menor;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();

        if (a < b && a < c) {
            menor = a;
        }else if (b < c) {
            menor = b;
        }else {
            menor = c;
        }

        System.out.print("O menos número digitado foi: " + menor);
    }
}
