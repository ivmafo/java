import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo ;
    private String nombre ;
    private int creditos ;
    private Profesor profesor ;
    private List<Estudiante> estudiantesInscritos ;

    public Curso(String codigo, String nombre, int creditos, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.estudiantesInscritos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("Código no puede ser nulo o vacío");
        }
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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        if (estudiante != null && !estudiantesInscritos.contains(estudiante)) {
            estudiantesInscritos.add(estudiante);
        } else {
            throw new IllegalArgumentException("Estudiante no puede ser nulo o ya está inscrito");
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", profesor=" + profesor +
                ", estudiantesInscritos=" + estudiantesInscritos +
                '}';
    }
}
