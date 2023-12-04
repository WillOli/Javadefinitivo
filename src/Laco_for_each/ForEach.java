package Laco_for_each;

public class ForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i=0; i<vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-------------");
        /*Para cada objeto obj contigo no vetor vect faça.*/
        for (String obj: vect) {
            System.out.println(obj);
        }

    }
}
