package function;
import javax.swing.*;
import java.util.function.Function;


public class ejemplo1 {
    public static void main(String[] args) {
        Function<String, String> toLower = str -> str.toLowerCase();
        Function<String, String> toUpper = str -> str.toUpperCase();
        String lowercaseString = toLower.apply(JOptionPane.showInputDialog("Ingrese una frase en mayúscula"));
        String uppercaseString  = toUpper.apply(JOptionPane.showInputDialog("Ingrese otra frase en minúscula"));
        JOptionPane.showMessageDialog(null, "La frase en mayúscula, convertida a minúscula es: " + lowercaseString);
        JOptionPane.showMessageDialog(null, "La frase en minúscula, convertida a mayúscula es: " + uppercaseString);
    }
}
