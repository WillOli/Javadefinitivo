package EstruturaEnquanto;

import java.util.Scanner;

/*
* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
encerrado. Considere que a senha correta é o valor 2002.*/
public class Exercicio_3_senha_fixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senhaCorreta = 2002;
        System.out.println("Digite a senha: ");
        while (true) {
            int senhaDigitada = input.nextInt();
            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso permitido!");
                break;
            }else {
                System.out.print("Senha Inválida! Tente novamente: ");
            }
        }
        input.close();
    }
}
