import java.util.*;
public class NumerosAleatoris {
    public static void main(String[] args) {
        Random aleatori = new Random();
        int numero = 14321;

        List<Integer> llista_nums = new ArrayList<>();

        for (int i = 0; i < 500000 ; i++) {
            int rand = aleatori.nextInt(700000);
        }

        System.out.println(llista_nums.contains(numero));
    }
}
