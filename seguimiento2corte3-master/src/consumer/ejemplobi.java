package consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;


public class ejemplobi {
    public static void main(String[] args) {
        List<Integer> numenteros1 = Arrays.asList(-3, -2, -1, 0);
        List<Integer> numenteros2 = Arrays.asList(4, 3, 1, 2);

        List<Integer> resultado = new ArrayList<>();

        BiConsumer<Integer, Integer> biConsumer = (l1, l2) -> resultado.add(l1 + l2);
        for(int i=0; i<numenteros1.size(); i++) {
            biConsumer.accept(numenteros1.get(i), numenteros2.get(i));
        }
        System.out.println(resultado);
    }
}
