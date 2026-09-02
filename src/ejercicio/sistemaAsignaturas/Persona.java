package ejercicio.sistemaAsignaturas;

import java.time.LocalDate;

public abstract class Persona implements ParticipanteAcademico {

    // Atributos
    private String run;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona(String run, String nombre, String apellido, LocalDate fechaNacimiento) {
        // atributos propios de la clase cuando se usan los mismos nombres en los parámetros,
        // se usa cuando hay choque entre parámetros y atributos
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters and setters
    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método concreto
    public void mostrarDatosPersonales() {
        System.out.println("Run: " + this.run);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Fecha nacimiento: " + this.fechaNacimiento);
    }

    // Método abstracto
    public abstract void mostrarInformacion();
}
