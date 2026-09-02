package ejercicio.sistemaAsignaturas;

public class Asignatura {

    // atributo
    private String codigo;
    private String nombre;
    private int creditos;
    private Alumno alumno;
    private Profesor profesor;

    public Asignatura(String codigo, String nombre, int creditos, Alumno alumno, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.alumno = alumno;
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }


    public void mostrarAsignatura() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Creditos: " + this.creditos);
        System.out.println("Profesor: " + this.profesor);
        System.out.println("Alumno: " + this.alumno);
    }
}
