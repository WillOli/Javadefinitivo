package SaidaDeDados;

import java.util.Locale;

public class imprindoDados {
    public static void main(String[] args) {

        double x = 10.35784;
        String nome = "William";
        int idade = 35;
        double renda = 4000.0;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " METROS.");
        System.out.printf("Resultado = %.2f metros%n", x);

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


    }
}
