package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/*Problema "notas"
Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
mensagem "REPROVADO", conforme exemplos.*/
public class Exercicio_1_notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);



        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double result = nota1 + nota2;

        if (result > 60) {
            System.out.printf("Nota final %.1f", result);
        }else {
            System.out.printf("Nota final %.1f", result);
            System.out.println("\nReprovado");
        }

        input.close();
    }
}