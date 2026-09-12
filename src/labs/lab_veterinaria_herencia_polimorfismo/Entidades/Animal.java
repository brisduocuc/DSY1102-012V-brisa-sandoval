package labs.lab_veterinaria_herencia_polimorfismo.Entidades;

public class Animal {
    private String name;
    private int age;
    private String tamano;
    private String raza;

    public Animal(String name, int age, String tamano, String raza) {
        this.name = name;
        this.age = age;
        this.tamano = tamano;
        this.raza = raza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
