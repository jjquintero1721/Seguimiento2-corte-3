package filter;
import java.util.Arrays;
import java.util.List;

public class ejemplo2 {
    public static void main(String[] args) {
        List<Integer> edades = Arrays.asList(12, 10, 2, 3, 80, 92, 50, 49, 52, 32, 25, 18, 45);

        List<Integer> comprobar = edades.stream()
                .filter(e -> e>20 && e<50)
                .toList();

        comprobar.forEach(System.out::println);
    }
}
