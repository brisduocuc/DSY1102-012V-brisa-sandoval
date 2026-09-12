package labs.lab_veterinaria_herencia_polimorfismo.Entidades;

public class Mascota extends Animal{
    private String owner;
    private String numero_registro;

    public Mascota(String name, int age, String tamano, String raza, String owner, String numero_registro) {
        super(name, age, tamano, raza);
        this.owner = owner;
        this.numero_registro = numero_registro;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumero_registro() {
        return numero_registro;
    }

    public void setNumero_registro(String numero_registro) {
        this.numero_registro = numero_registro;
    }
}
