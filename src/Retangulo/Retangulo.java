package Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double baseRetangulo, alturaRetangulo, areaRetangulo, perimetro, diagonal;

        System.out.print("Base do retangulo: ");
        baseRetangulo = input.nextDouble();

        System.out.print("Altura do retangulo: ");
        alturaRetangulo = input.nextDouble();

        areaRetangulo = baseRetangulo * alturaRetangulo;

        perimetro = 2 * (baseRetangulo +  alturaRetangulo);
        diagonal = Math.sqrt(Math.pow(baseRetangulo, 2.0) + Math.pow(alturaRetangulo, 2.0));

        System.out.println("AREA = " + String.format("%.4f", areaRetangulo));
        System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));

        input.close();






    }
}
