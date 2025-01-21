import java.util.ArrayList;
import java.util.List;
public class Profesor extends Persona {
    private String departamento ;
    private List<Curso> cursosAsignados ;
    public Profesor(String nombre, String apellido, String ID) {
        super(nombre, apellido, ID);
    }
    public Profesor(String nombre, String apellido, String ID, String departamento) {
        super(nombre, apellido, ID);
        this.departamento = departamento;
        this.cursosAsignados = new ArrayList<>();
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void asignarCurso(Curso curso){
        cursosAsignados.add(curso) ;
    }
    public List<Curso> consultarCursos(){
        return cursosAsignados;
    }
    public void evaluarEstudiante( Estudiante estudiante , Curso curso, Nota nota){
        estudiante.agregarNota(curso,nota);
    }
}
