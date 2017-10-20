import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
public class NumerosAleatoris {
    public static void main(String[] args) {
        long timer = System.currentTimeMillis();
        Random aleatori = new Random();
        int numero = 14321;

        List<Integer> llista_nums = new ArrayList<>();

        for (int i = 0; i < 500000 ; i++) {
            int rand = aleatori.nextInt(1000000);
        }

        System.out.println(llista_nums.contains(numero));


        System.out.println("Ha tardat " + (System.currentTimeMillis() - timer) + "ms en trobar el numero");
    }
}
