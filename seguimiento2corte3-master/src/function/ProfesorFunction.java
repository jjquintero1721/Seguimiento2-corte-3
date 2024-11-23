package function;

import javax.swing.*;
import java.util.function.Function;

public class ProfesorFunction {
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        profesor.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del profesor"));
        profesor.setApellido(JOptionPane.showInputDialog(null, "Ingrese el apellido del profesor"));
        profesor.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del profesor")));
        profesor.setFacultad(JOptionPane.showInputDialog(null, "Ingrese la facultad del profesor"));
        profesor.setMateria(JOptionPane.showInputDialog(null, "Ingrese la materia que dicta el profesor"));
        Function<Profesor, String> mostrarinfo = x -> "El profesor " + x.getNombre() + " " + x.getApellido() + ", cuya edad es " + x.getEdad() +
                ", pertenece a la facultad de " + x.getFacultad() + ", en la cual da la materia de " + x.getMateria();
        JOptionPane.showMessageDialog(null, mostrarinfo.apply(profesor));
    }
}
