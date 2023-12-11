package EstruturaEnquanto;

/*
* Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
mostrar a mensagem "IMPOSSIVEL CALCULAR".*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_media_idades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double idade, quantidadePessoas = 0, somaIdade = 0;
        System.out.println("Digite as idades: ");
        while(true) {
            idade = input.nextDouble();

            if (idade < 0) {
                if (quantidadePessoas == 0) {
                    System.out.println("Impossivel calcular.");
                }else {
                    double mediaIdade = somaIdade / quantidadePessoas;
                    System.out.printf("Média de idade %.2f: ", mediaIdade);
                }
                break;
            }

            somaIdade += idade;
            quantidadePessoas++;
        }
        input.close();

    }
}
