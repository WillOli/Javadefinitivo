package utils;

public class Calculator {

    public  final double PI = 3.14159;

    /*Declarando função que calcula a circunferência do raio*/
    public  double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public  double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
