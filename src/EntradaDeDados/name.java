package EntradaDeDados;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.print("Digite seu nome completo: ");
        sc.nextLine();         //-----------limpezar do buffer
        nome = sc.nextLine();
        System.out.println(nome + "\n" + "Idade: " + idade);


    }
}
