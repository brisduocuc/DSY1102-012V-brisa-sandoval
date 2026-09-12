package labs.lab_veterinaria_herencia_polimorfismo.Entidades;

public class Leon extends Salvaje {
    private String esSagrado;

    public Leon(String name, int age, String tamano, String raza, String zoo, String anios_capturado, String esSagrado) {
        super(name, age, tamano, raza, zoo, anios_capturado);
        this.esSagrado = esSagrado;
    }

    public String getEsSagrado() {
        return esSagrado;
    }

    public void setEsSagrado(String esSagrado) {
        this.esSagrado = esSagrado;
    }
}
