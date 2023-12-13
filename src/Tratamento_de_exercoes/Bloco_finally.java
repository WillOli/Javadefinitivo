package Tratamento_de_exercoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bloco_finally {
    public static void main(String[] args) {
        File file = new File("E:\\Programação\\JAVA\\Javadefinitivo\\src\\Tratamento_de_exercoes\\textobase.txt");
        Scanner input = null;
        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
