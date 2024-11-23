package consumer;

public class estudianteConsumer {
    private String nombre;
    private String apellido;
    private int edad;
    private String facultad;

    public estudianteConsumer(String nombre, String apellido, int edad, String facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getFacultad() {
        return facultad;
    }

}
