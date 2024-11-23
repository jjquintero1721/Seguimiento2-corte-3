package map;

public class ejemplo1 {
    private int cedula;
    private String nombre;
    private String apellido;
    private double salario;

    public ejemplo1(int cedula, String nombre, String apellido, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
