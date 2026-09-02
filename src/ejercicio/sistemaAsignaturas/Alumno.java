package ejercicio.sistemaAsignaturas;

import java.time.LocalDate;

public class Alumno extends Persona{

    // Atributos
    private int numeroMatricula;
    private double promedio;
    private Asignatura asignatura;

    public Alumno(String run, String nombre, String apellido, LocalDate fechaNacimiento, int numeroMatricula, double promedio, Asignatura asignatura) {
        super(run, nombre, apellido, fechaNacimiento);
        this.numeroMatricula = numeroMatricula;
        this.promedio = promedio;
        this.asignatura = asignatura;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public void realizarActividad() {
        System.out.println("El alumno está estudiando Desarrollo Orientado a Objetos.");
    }
}
