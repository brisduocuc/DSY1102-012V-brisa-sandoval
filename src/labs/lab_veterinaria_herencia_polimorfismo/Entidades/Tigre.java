package labs.lab_veterinaria_herencia_polimorfismo.Entidades;

public class Tigre extends Salvaje{
    private String tipoRayas;

    public Tigre(String name, int age, String tamano, String raza, String zoo, String anios_capturado, String tipoRayas) {
        super(name, age, tamano, raza, zoo, anios_capturado);
        this.tipoRayas = tipoRayas;
    }

    public String getTipoRayas() {
        return tipoRayas;
    }

    public void setTipoRayas(String tipoRayas) {
        this.tipoRayas = tipoRayas;
    }
}
