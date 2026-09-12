package labs.lab_veterinaria_herencia_polimorfismo.Entidades;

public class Gato extends Animal {
    private String tipoCola;

    public Gato(String name, int age, String tamano, String raza, String tipoCola) {
        super(name, age, tamano, raza);
        this.tipoCola = tipoCola;
    }


    public String gettipoCola() {
        return tipoCola;
    }

    public void settipoCola(String tipoCola) {
        this.tipoCola = tipoCola;
    }
}



