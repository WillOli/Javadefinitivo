import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("E:\\Programação\\JAVA\\Javadefinitivo\\TrabalhandoComArquivos\\src\\document\\texto.txt");
        Scanner input = null;
        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

}