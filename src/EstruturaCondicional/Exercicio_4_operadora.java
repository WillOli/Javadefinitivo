package EstruturaCondicional;

import java.util.Scanner;

/*Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.*/
public class Exercicio_4_operadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutos;
        double valorPago = 50;

        System.out.print("Digite a quantidade de minutos: ");
        minutos = input.nextInt();

        if (minutos > 100) {
            valorPago = valorPago + 2 * (minutos - 100);
        }
        System.out.printf("Valor a pagar: %.2f", valorPago);

        input.close();



    }
}
