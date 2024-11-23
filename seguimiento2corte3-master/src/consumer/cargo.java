package consumer;

public class cargo {
    private String ocupacion;
    private String tiempo;

    public cargo(String ocupacion, String tiempo) {
        this.ocupacion = ocupacion;
        this.tiempo = tiempo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
