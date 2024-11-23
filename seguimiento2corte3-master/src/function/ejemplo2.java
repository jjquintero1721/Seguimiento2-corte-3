package function;
import javax.swing.*;
import java.lang.Math;
import java.util.function.Function;

public class ejemplo2 {
    public static void main(String[] args) {
        Function<Double, Double> raiz = x -> Math.sqrt(x);
        Double raiznumero = raiz.apply(Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número")));
        JOptionPane.showMessageDialog(null, "La raíz del número ingresado es: " + raiznumero);
    }
}
