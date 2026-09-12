package labs.lab_veterinaria_herencia_polimorfismo.Entidades;

public class Perro extends Mascota{
    private String color;

    public Perro(String name, int age, String tamano, String raza, String owner, String numero_registro, String color) {
        super(name, age, tamano, raza, owner, numero_registro);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
