package function;

public class estudiantebi {
    private String nombre;
    private int edad;
    private String materiareprobada;

    public estudiantebi(String nombre, int edad, String materiareprobada) {
        this.nombre = nombre;
        this.edad = edad;
        this.materiareprobada = materiareprobada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateriareprobada() {
        return materiareprobada;
    }

    public void setMateriareprobada(String materiareprobada) {
        this.materiareprobada = materiareprobada;
    }
}
