import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Estudiante extends Persona {
    private String carrera ;
    private int creditos ;
    private List<Curso> cursosInscritos ;
    private Map<Curso,List<Nota>> historialNotas ;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Estudiante(String nombre, String apellido, String ID) {
        super(nombre, apellido, ID);
    }

    public Estudiante(String nombre, String apellido, String ID, String carrera) {
        super(nombre, apellido, ID);
        this.carrera = carrera;
        this.creditos = 0;
        this.cursosInscritos = new ArrayList<>();
        this.historialNotas = new HashMap<>();
    }
    public void inscribirCurso(Curso curso) {
        if (curso != null && !cursosInscritos.contains(curso)) {
            cursosInscritos.add(curso);
            creditos += curso.getCreditos();
        } else {
            throw new IllegalArgumentException("Curso no puede ser nulo o ya está inscrito");
        }
    }
    public List<Curso> consultarCursos(){
        return cursosInscritos;
    }
    public void agregarNota(Curso curso,Nota nota){
        historialNotas.putIfAbsent(curso,new ArrayList<>());
        historialNotas.get(curso).add(nota);
    }
    public Map<Curso, List<Nota>> consultarHistorial() {
        return new HashMap<>(historialNotas);
    }
}
