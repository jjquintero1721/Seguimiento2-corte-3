package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejemplo1Main {
    public static void main(String[] args) {
        List<ejemplo1> listado = Arrays.asList(
                new ejemplo1(112356798, "Brandon", "Ortiz Medina", 9500000),
                new ejemplo1(112323798, "Esteban", "Ortiz Marquez", 6500000),
                new ejemplo1(112323654, "Mariana", "Reyes Torres", 4850000),
                new ejemplo1(116432798, "Samantha", "Giraldo Gonzalez", 3300000),
                new ejemplo1(102392302, "Tania", "Toro Yepes", 5000000)
        );
        System.out.println("AUMENTO DE SALARIO PARA EMPLEADOS - INNOVA SOFTWARE");
        List<ejemplo1> modificar = listado.stream()
                .map(empleado -> {
                        empleado.setCedula(empleado.getCedula());
                        empleado.setNombre(empleado.getNombre().toUpperCase());
                        empleado.setApellido(empleado.getApellido().toUpperCase());
                        empleado.setSalario((empleado.getSalario())+(empleado.getSalario()*0.25));
                        return empleado;
                        }
                        )
                .collect(Collectors.toList());
        modificar.forEach(empleado -> System.out.println("DNI: " + empleado.getCedula() + " ----- "
                + empleado.getNombre() + " " + empleado.getApellido() + " ----- " + " Nuevo salario: " + empleado.getSalario()));
    }
}
