package function;

import java.util.function.BiFunction;

public class bifunction2 {
    public static void main(String[] args) {
        estudiantebi estudiante = new estudiantebi("Brandon", 17, null);
        profesorbi profesor = new profesorbi("Gerardo", "Ecuaciones diferenciales");

        BiFunction<estudiantebi, profesorbi, String> aprobaroreprobar = (e, p) -> {
            e.setMateriareprobada("Ecuaciones diferenciales");
            return p.getNombre() + " reprobó a " + e.getNombre() + " en la materia de " + e.getMateriareprobada();
        };
        System.out.println(aprobaroreprobar.apply(estudiante, profesor));
    }
}
