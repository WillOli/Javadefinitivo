package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/*Uma empresa vai conceder um aumento percentual de
salário aos seus funcionários dependendo de quanto
cada pessoa ganha, conforme tabela ao lado. Fazer um
programa para ler o salário de uma pessoa, daí mostrar
qual o novo salário desta pessoa depois do aumento,
quanto foi o aumento e qual foi a porcentagem de
aumento.

Salário atual  -            Aumento
Até R$ 1000.00 -            20%
Acima de R$ 1000.00
até R$ 3000.00
                -           15%
Acima de R$ 3000.00
até R$ 8000.00
                            10%
Acima de R$ 8000.00         5%
*/
public class Exercicio_9_aumento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double salarioAtual, aumentoPercentual, novoSalario;

        System.out.print("Digite o salário da pessoa: ");
        salarioAtual = input.nextDouble();

        if (salarioAtual <= 1000) {
            aumentoPercentual = 0.20;
        } else if (salarioAtual <= 3000) {
            aumentoPercentual = 0.15;
        } else if (salarioAtual <= 8000) {
            aumentoPercentual = 0.10;
        } else {
            aumentoPercentual = 0.05;
        }

        novoSalario = salarioAtual * (1 + aumentoPercentual);

        // calcula valor do aumento
        double valorAumento = novoSalario - salarioAtual;

        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
        System.out.printf("Aumento: R$ %.2f\n", valorAumento);
        System.out.printf("Porcentagem de aumento: %.2f%%\n", aumentoPercentual * 100);

        input.close();

    }
}
