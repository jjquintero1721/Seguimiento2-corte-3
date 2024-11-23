package sorted;
import filter.Estudiante;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ejemplo1 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante(123238232, "Brandon", "Ortiz Medina", 17, "Once", "Ninguna"),
                new Estudiante(123238232, "Zendaya", "Ocampo Diaz", 16, "Decimo", "Ninguna"),
                new Estudiante(123238232, "Marlon", "Sandler Rios", 17, "Decimo", "Ninguna"),
                new Estudiante(123238232, "Bartolomeo", "Marulanda Savedra", 17, "Onde", "Ninguna"),
                new Estudiante(123238232, "Laura", "Garcia Dominguez", 13, "Octavo", "Ninguna"),
                new Estudiante(123238232, "Balier", "Banderas Meldrano", 16, "Decimo", "Ninguna"),
                new Estudiante(123238232, "Bruno", "Banderas Meldrano", 16, "Once", "Ninguna")
        );

        List<Estudiante> ordernar = estudiantes.stream()
                .filter(edades -> edades.getEdad() >= 15 && edades.getNombre().startsWith("B"))
                .sorted(Comparator.comparing(Estudiante::getNombre))
                .toList();
        ordernar.forEach(o -> System.out.println(o.getNombre() + " " + o.getEdad()));


    }
}
