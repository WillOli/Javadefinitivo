package Listas;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("William");
        list.add("Leleco");
        list.add("Wemerson");
        list.add("Wellington");
        list.add("Maria 'Helena");
        list.add(2, "Vazia");

        System.out.println(list.size());


        for(String nomes : list) {
            System.out.println(nomes);
        }
        System.out.println("----------------");
        /*Predicate faz uma comparação com expressão lambda*/
        list.removeIf(x -> x.charAt(0) == 'W');

        for(String nomes : list) {
            System.out.println(nomes);
        }
        System.out.println("-----------------");
        System.out.println("Index of Leleco: " + list.indexOf("Leleco"));
        System.out.println("Index of Marco: " + list.indexOf("Bob"));
        System.out.println("-----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'W').collect(Collectors.toList());
        for(String nomes : result) {
            System.out.println(nomes);
        }
        System.out.println("-----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(name);

    }
}
