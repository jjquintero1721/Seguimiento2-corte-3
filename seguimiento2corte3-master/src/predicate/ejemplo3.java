package predicate;

public class ejemplo3 {
    private String nombre;
    private String apellido;
    private String cargo;
    private boolean contratoactivo;

    public ejemplo3(String nombre, String apellido, String cargo, boolean contratoactivo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.contratoactivo = contratoactivo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isContratoactivo() {
        return contratoactivo;
    }

    public void setContratoactivo(boolean contratoactivo) {
        this.contratoactivo = contratoactivo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + cargo + " - Contrato Activo: " + contratoactivo;
    }
}
