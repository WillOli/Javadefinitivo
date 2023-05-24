package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();
        char z = sc.next().charAt(0);
        String s = sc.nextLine();

        sc.close();

    }
}
