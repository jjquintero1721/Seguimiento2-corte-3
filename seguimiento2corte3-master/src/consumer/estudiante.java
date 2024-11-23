package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class estudiante {
    public static void main(String[] args) {
        List<estudianteConsumer> estudiantes = new ArrayList<>();
        estudiantes.add(new estudianteConsumer("Brandon", "Ortiz Medina", 17, "Ingeniería"));
        estudiantes.add(new estudianteConsumer("Mariana", "Mejia Patiño", 16, "Medicina"));
        estudiantes.add(new estudianteConsumer("Immanuel", "Kant", 20, "Filosofía"));

        Consumer<List<estudianteConsumer>> consumer = (listaestudiantes) -> {
            for(estudianteConsumer estudiante : listaestudiantes) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getApellido() + " - " + estudiante.getEdad() + " - " + estudiante.getFacultad());
            }
        };
        consumer.accept(estudiantes);
    }
}
