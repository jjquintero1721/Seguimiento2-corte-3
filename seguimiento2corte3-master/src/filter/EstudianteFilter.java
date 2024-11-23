package filter;
import java.util.Arrays;
import java.util.List;


public class EstudianteFilter {
    public static void main(String[] args) {
        List<Estudiante> listado = Arrays.asList(
                new Estudiante(1113593419, "Brandon", "Ortiz Medina", 16, "Once", "Geometría"),
                new Estudiante(1114592324, "Martin", "Gonzalez Avedaño", 15, "Décimo", "Cálculo"),
                new Estudiante(1134920323, "Lucía", "Ríos Castaño", 13, "Octavo", "Biología"),
                new Estudiante(1128329321, "Rebeca", "Santibañez Ruiz", 16, "Décimo", "Cálculo"),
                new Estudiante(1128365746, "Mariana", "Estrada Ruiz", 14, "Noveno", "Geometría"),
                new Estudiante(1128323421, "Rebeca", "Santibañez Ruiz", 16, "Once", "Castellano"),
                new Estudiante(1125675321, "Santiago", "Lopez Melo", 15, "Décimo", "Inglés")
        );

        System.out.println("LISTADO DE REPROBADOS (Cálculo con letra B)");
        List<Estudiante> comprobarmaterias = listado.stream()
                .filter(c -> c.getMateriareprobada().equals("Cálculo") && c.getNombre().startsWith("B"))
                .toList();
        comprobarmaterias.forEach(x -> System.out.println(x.getNombre() + " " + x.getApellido() + " ----- " + "Materia reprobada: " + x.getMateriareprobada()));
        System.out.println("---------------------------------------------------------");
        List<Estudiante> comprobarmaterias2 = listado.stream()
                .filter(p -> p.getMateriareprobada().equals("Biología"))
                .toList();
        comprobarmaterias2.forEach(x -> System.out.println(x.getNombre() + " " + x.getApellido() + " ------ " + "Materia reprobada: " + x.getMateriareprobada()));
        System.out.println("---------------------------------------------------------");
    }
}
