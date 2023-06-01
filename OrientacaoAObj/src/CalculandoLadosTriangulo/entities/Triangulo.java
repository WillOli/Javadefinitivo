package CalculandoLadosTriangulo.entities;

public class Triangulo {
    /*Atributos do triângulo.*/

    public double a;
    public double b;
    public double c;


    /* Chamando os atributos da class.
    Função(método) sem parâmetros, retornando o calculo da área do trinâgulo.*/
    public double   area() {
        double p = (a + b + c ) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
