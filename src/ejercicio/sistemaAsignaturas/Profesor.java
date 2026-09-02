package ejercicio.sistemaAsignaturas;

import java.time.LocalDate;

public class Profesor extends Persona{

    // Atributos
    private String especialidad;
    private int horasSemanales;
    private Asignatura asignatura;

    public Profesor(String run, String nombre, String apellido, LocalDate fechaNacimiento, String especialidad, int horasSemanales, Asignatura asignatura) {
        super(run, nombre, apellido, fechaNacimiento);
        this.especialidad = especialidad;
        this.horasSemanales = horasSemanales;
        this.asignatura = asignatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
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
        System.out.println("El profesor está impartiendo Desarrollo Orientado a Objetos.");
    }
}
