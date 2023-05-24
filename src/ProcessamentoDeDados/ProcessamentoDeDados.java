package ProcessamentoDeDados;

public class ProcessamentoDeDados {
    public static void main(String[] args) {
        System.out.print("Bom dia ");
        System.out.print("Boa noite ");
        System.out.println("Bom dia");
        System.out.println("Boa noite");

        int x, y;
        x = 10;
        y = 20;
        System.out.println(x);
        System.out.println(y);

        double k;
        k = 2.3456;

        int idade ;
        double salario;
        String nome;
        char sexo;

        idade = 32;
        salario = 4650.0;
        nome = "Maria Silva";
        sexo = 'F';

        System.out.println("A funcionaria " + nome + ", do sexo " + sexo + ", ganha " + String.format("%.2f", salario) + "e tem "+ idade + " anos");

    }
}
