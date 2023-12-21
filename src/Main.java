import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(45);
        lista.add(38);
        lista.add(25);
        lista.add(40);
        Collections.sort(lista);
        System.out.println(lista);

    }
}