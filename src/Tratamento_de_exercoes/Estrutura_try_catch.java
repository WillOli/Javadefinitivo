package Tratamento_de_exercoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Estrutura_try_catch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        try{
            String[] vect = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalidation position.");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }


        System.out.println("End program.");
    }
}
