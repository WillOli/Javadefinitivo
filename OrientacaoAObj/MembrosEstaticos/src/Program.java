import utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*Instanciando uma constante
    * A palavra final diz que esta variável é uma constante.*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Calculator  calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        input.close();
    }

}