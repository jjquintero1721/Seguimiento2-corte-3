package map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejemplo2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(25, 9, 16, 81, 34, 6);

        List<Double> raiz = numeros.stream()
                .map(x -> Math.sqrt(x))
                .collect(Collectors.toList());
        System.out.println(raiz);
    }
}
