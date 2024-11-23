package consumer;
import java.util.function.BiConsumer;


public class innovasoftwaremain {
    public static void main(String[] args) {
        innovasoftware x = new innovasoftware("Brandon", "Ortiz Medina", "17", "113594034", "313856741", "Ingeniero de software junior", "5 meses");
        cargo y = new cargo("Ingeniero de software senior", "10 meses");

        BiConsumer<innovasoftware, cargo> biConsumer = (inn, car) -> inn.setOcupacion(car.getOcupacion());
        biConsumer.accept(x, y);

        BiConsumer<innovasoftware, cargo> biConsumer2 = (inn, car) -> inn.setDuracioncargo(car.getTiempo());
        biConsumer2.accept(x, y);

        System.out.println("Nombre: " + x.getNombre());
        System.out.println("Apellido: " + x.getApellido());
        System.out.println("Cédula: " + x.getCedula());
        System.out.println("Teléfono: " + x.getTelefono());
        System.out.println("Ocupación: " + x.getOcupacion());
        System.out.println("Duración en el cargo: " + x.getDuracioncargo());
    }
}
