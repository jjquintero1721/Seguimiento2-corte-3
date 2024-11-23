package sorted;

import java.util.Arrays;
import java.util.List;

public class ejemplo2 {
    public static void main(String[] args) {
        List<Double> numeros = Arrays.asList(2.4, 3.2, 2.00001, 1.9999, 0.002323123, 5.8, 4.2323);

        List<Double> ordenarnumeros = numeros.stream()
                .map(n -> n/2)
                .sorted()
                .toList();
        System.out.println(ordenarnumeros);
    }
}
