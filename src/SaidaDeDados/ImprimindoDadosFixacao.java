package SaidaDeDados;

public class ImprimindoDadosFixacao {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 35;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which is $ %.2f%n",product1, price1);
        System.out.printf("%s, which price is $ %.2f%n",product2, price2);
        System.out.printf("Record: %d old, code %d and gender: %c%n", age, code, gender);
        System.out.printf("Measue with eith decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal place): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
