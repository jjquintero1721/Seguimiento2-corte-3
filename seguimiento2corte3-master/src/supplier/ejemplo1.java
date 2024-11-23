package supplier;
import java.util.Scanner;
import java.util.function.Supplier;

public class ejemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier<Integer> aleatorio = () -> (int) (Math.random()*1000);
        int randomnum = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE NUMERITOS ALEATORIOS ---");
            System.out.println("1. Generar nuevo número aleatorio");
            System.out.println("2. Mostrar el último número aleatorio generado");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    randomnum = aleatorio.get();
                    System.out.println("Número aleatorio generado: " + randomnum);
                    break;
                case 2:
                    System.out.println("Último número aleatorio: " + randomnum);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
