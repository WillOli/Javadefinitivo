import model.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.print("Holder: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Initial balance: ");
        double balance = input.nextDouble();
        System.out.print("withdraw limit: ");
        double withdrawLimit = input.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = input.nextDouble();

        acc.winthdraw(amount);
        System.out.printf("Novo saldo: %.2f%n", acc.getBalance());

        input.close();



    }
}