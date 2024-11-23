package consumer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ejemplo2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un primer número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un segundo número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un tercer número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un cuarto número")));

        Consumer<Integer> consumer = numero -> numeros.set(numeros.indexOf(numero), numero%2);
        numeros.forEach(consumer);
        System.out.println(numeros);
    }
}
