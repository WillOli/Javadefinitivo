package EstruturaCondicional;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
horas.*/

import java.util.Scanner;

public class Exercicio_10_duracao_jogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo (0 a 23): ");
        int horaInicial = input.nextInt();

        System.out.print("Digite a hora final do jogo (0 a 23): ");
        int horaFinal = input.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("Duração do jogo: " + duracao + " horas");

        input.close();

    }
}
