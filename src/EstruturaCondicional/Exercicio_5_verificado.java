package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5_verificado {

    /*Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
    O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
    e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
    ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
    valor restante conforme exemplo.*/
    public static void main(String[] args) {
        double preco, dinheiro, troco, resto;
        int quantidade;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Preço unitário do produto: ");
        preco = input.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = input.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiro = input.nextDouble();

        if (dinheiro >= (preco * quantidade)) {
            troco = dinheiro - preco * quantidade;
            System.out.printf("Troco = %.2f", troco);
        }else{
            resto = preco * quantidade - dinheiro;
            System.out.printf("Dinheiro insuficiente. Faltam %.2f", resto, " reais");
        }
        input.close();

    }
}
