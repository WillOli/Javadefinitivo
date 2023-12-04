package Boxing_unboxing;

import java.util.Objects;

public class boxing {

    /*Wrapper classses
    * São classes equivalentes aos tipos primitivos
    * Boxing e unboxing é natural na linguagem
    * Uso comum: campos de entidades em sistemas de informção (IMPORTANTE!)
    * Pois tipos referência (Classes) aceitam valor null e usufruem dos recuros OO
    *
    * Exemplo: int = primitivo
    *          Integer = Classe*
               double = primitivo
               Double = Classe
               long = primitivo
               Long = Classe
     */
    public static void main(String[] args) {
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;
        System.out.println(y);
    }
}
