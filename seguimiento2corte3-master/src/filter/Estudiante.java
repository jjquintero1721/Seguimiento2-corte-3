package filter;

public class Estudiante {
    private int tarjetaidentidad;
    private String nombre;
    private String apellido;
    private int edad;
    private String grado;
    private String materiareprobada;

    public Estudiante(int tarjetaidentidad, String nombre, String apellido, int edad, String grado, String materiareprobada) {
        this.tarjetaidentidad = tarjetaidentidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.grado = grado;
        this.materiareprobada = materiareprobada;
    }

    public int getTarjetaidentidad() {
        return tarjetaidentidad;
    }

    public void setTarjetaidentidad(int tarjetaidentidad) {
        this.tarjetaidentidad = tarjetaidentidad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getMateriareprobada() {
        return materiareprobada;
    }

    public void setMateriareprobada(String materiareprobada) {
        this.materiareprobada = materiareprobada;
    }
}
