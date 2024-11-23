package consumer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ejemplo1 {
    public static void main(String[] args) {
        List<String> nombres =  new ArrayList<>();
        nombres.add(JOptionPane.showInputDialog("Ingresa tu nombre"));
        nombres.add(JOptionPane.showInputDialog("Ingresa el nombre de tu ciudad"));
        nombres.add(JOptionPane.showInputDialog("Ingresa el nombre de tu perro"));

        Consumer<String> consumer = nombre -> System.out.println(nombre);
        nombres.forEach(consumer);

    }
}
