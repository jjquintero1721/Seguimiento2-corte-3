package predicate;
import javax.swing.*;
import java.util.function.Predicate;

public class ejemplo3Main {
    public static void main(String[] args) {
        ejemplo3 trabajador1 = new ejemplo3("Brandon", "Ortiz Medina", "Ingeniero de software", true);
        ejemplo3 trabajador2 = new ejemplo3("Angélica", "Estrada Ruiz", "Ingeniera eléctrica", false);
        ejemplo3 trabajador3 = new ejemplo3("Gerardo", "Santibañez Melano", "Ingeniero de sistemas", true);
        ejemplo3 trabajador4 = new ejemplo3("Lucia", "Ortiz Diaz", "Programadora", false);

        Predicate<ejemplo3> comprobar = ejemplo3::isContratoactivo;
        JOptionPane.showMessageDialog(null, "Estado de contrato del trabajador 1: " + comprobar.test(trabajador1));
        JOptionPane.showMessageDialog(null, "Estado de contrato del trabajador 2: " + comprobar.test(trabajador2));
        JOptionPane.showMessageDialog(null, "Estado de contrato del trabajador 3: " + comprobar.test(trabajador3));
        JOptionPane.showMessageDialog(null, "Estado de contrato del trabajador 1: " + comprobar.test(trabajador4));
    }
}
