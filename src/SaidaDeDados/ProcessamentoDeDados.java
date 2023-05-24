package SaidaDeDados;

import java.util.Locale;

public class ProcessamentoDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);

        int q;
        double w;

        q = 5;
        w = 2 * q;
        System.out.println(x);
        System.out.println(String.format("%.1f", w));

        double b1, b2, h, area;
        b1 = 6.0;
        b2 = 8.0;
        h = 5.0;
        area = (b1 + b2) / 2.0 * h;
        System.out.println(area);

        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = (double) a / b;
        System.out.println(resultado);

        double c;
        int d;

        c = 5.0;
        d = (int) c;
        System.out.println(b);

    }


}
