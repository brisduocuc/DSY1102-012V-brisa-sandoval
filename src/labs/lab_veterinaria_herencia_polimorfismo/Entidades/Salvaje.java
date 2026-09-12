package labs.lab_veterinaria_herencia_polimorfismo.Entidades;

public class Salvaje extends Animal {
    private String zoo;
    private String anios_capturado;

    public Salvaje(String name, int age, String tamano, String raza, String zoo, String anios_capturado) {
        super(name, age, tamano, raza);
        this.zoo = zoo;
        this.anios_capturado = anios_capturado;

    }

    public String getZoo() {
        return zoo;
    }

    public void setZoo(String zoo) {
        this.zoo = zoo;
    }

    public String getAnios_capturado() {
        return anios_capturado;
    }

    public void setAnios_capturado(String anios_capturado) {
        this.anios_capturado = anios_capturado;
    }


    public void emitir_sonido() {
        System.out.println("Emitiendo sonido");
    }
}
