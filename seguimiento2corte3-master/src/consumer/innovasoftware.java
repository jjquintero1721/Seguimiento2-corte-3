package consumer;

public class innovasoftware {
    private String nombre;
    private String apellido;
    private String edad;
    private String cedula;
    private String telefono;
    private String ocupacion;
    private String duracioncargo;

    public innovasoftware(String nombre, String apellido, String edad, String cedula, String telefono, String ocupacion, String duracioncargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.duracioncargo = duracioncargo;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDuracioncargo() {
        return duracioncargo;
    }

    public void setDuracioncargo(String duracioncargo) {
        this.duracioncargo = duracioncargo;
    }
}
