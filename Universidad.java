import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Estudiante> listaEstudiantes ;
    private List<Profesor> listaProfesores ;
    private List<Curso> listaCursos ;

    public Universidad() {
        this.listaEstudiantes = new ArrayList<>() ;
        this.listaProfesores =  new ArrayList<>() ;
        this.listaCursos =  new ArrayList<>() ;
    }

    public void agregarEstudiante(Estudiante estudiante){
        if (estudiante != null && !listaEstudiantes.contains(estudiante)){
            listaEstudiantes.add(estudiante) ;
        } else {
            throw new IllegalArgumentException("Estudiante no puede ser nulo");
        }
    }

    public void agregarProfesor(Profesor profesor){
        if (profesor != null && !listaProfesores.contains(profesor)){
            listaProfesores.add(profesor) ;
        } else {
            throw new IllegalArgumentException("Profesor no puede ser nulo");
        }
    }

    public void agregarCurso(Curso curso){
        if (curso != null && !listaCursos.contains(curso)){
            listaCursos.add(curso) ;
        } else {
            throw new IllegalArgumentException("Curso no puede ser nulo");
        }
    }

    public void actualizarEstudiante(String IDEstudiante, String nombreEstudiante,
                                     String apellidoEstudiante, String carreraEstudiante){
        Estudiante estudiante = consultarEstudiante(IDEstudiante);
        if(estudiante != null){
            if(nombreEstudiante!=null) estudiante.setNombre(nombreEstudiante);
            if(apellidoEstudiante!=null) estudiante.setApellido(apellidoEstudiante);
            if(carreraEstudiante!=null) estudiante.setCarrera(carreraEstudiante);
        } else {
            System.out.println("Estudiante no Encontrado");
        }
    }

    public void actualizarProfesor(String IDProfesor, String nombreProfesor,
                                   String apellidoProfesor, String departamentoProfesor){
        Profesor profesor = consultarProfesor(IDProfesor);
        if(profesor != null){
            if(nombreProfesor!=null) profesor.setNombre(nombreProfesor);
            if(apellidoProfesor!=null) profesor.setApellido(apellidoProfesor);
            if(departamentoProfesor!=null) profesor.setDepartamento(departamentoProfesor);
        } else {
            System.out.println("Profesor no Encontrado");
        }
    }

    public void actualizarCurso(String codigo, String nombreCurso,
                                Integer creditos){
        Curso curso = consultarCurso(codigo);
        if( curso != null){
            if(nombreCurso!=null) curso.setNombre(nombreCurso);
            if(creditos!=null) curso.setCreditos(creditos);

        } else {
            System.out.println("Curso no Encontrado");
        }
    }

    public Estudiante consultarEstudiante(String IDs){
        for(Estudiante estudiante : listaEstudiantes){
            if(estudiante.getID().equals(IDs)){
                return estudiante;
            }
        }
        return null;
    }

    public Profesor consultarProfesor(String IDs){
        for(Profesor profesor : listaProfesores){
            if(profesor.getID().equals(IDs)){
                return profesor;
            }
        }
        return null;
    }

    public Curso consultarCurso(String codigo){
        for(Curso curso : listaCursos){
            if(curso.getCodigo().equals(codigo)){
                return curso;
            }
        }
        return null;
    }
    // particulares

    public void inscribirEstudiantesEnCurso(Estudiante estudiante, Curso curso){
        if(estudiante!=null && curso!=null){
            curso.inscribirEstudiante(estudiante);
            estudiante.inscribirCurso(curso);
        } else {
            throw new IllegalArgumentException("Estudiante o curso no pueden ser nulos");
        }
    }

    public void registrarEvaluacion(Estudiante estudiante, Curso curso , Nota nota){
        if(estudiante!=null && curso!=null && nota != null) {
            estudiante.agregarNota(curso, nota);
        } else {
            throw new IllegalArgumentException("Evaluacion no puede registrarse");
        }
    }

    public List<Nota> consultarEvaluaciones(Estudiante estudiante, Curso curso) {
        if (estudiante != null && curso != null) {
            return estudiante.consultarHistorial().getOrDefault(curso, new ArrayList<>());
        } else {
            throw new IllegalArgumentException("Estudiante o curso no pueden ser nulos");
        }
    }

    public void mostrarReporte() {
        System.out.println("Reporte de la Universidad:");
        System.out.println("\nEstudiantes:");

        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.getNombre() + " "
                    + estudiante.getApellido() + " - ID: "
                    + estudiante.getID());
        }
        System.out.println("\nProfesores:");

        for (Profesor profesor : listaProfesores) {
            System.out.println(profesor.getNombre() + " "
                    + profesor.getApellido() + " - Departamento: "
                    + profesor.getDepartamento() + " - ID: "
                    + profesor.getID());
        }
        System.out.println("\nCursos:");

        for (Curso curso : listaCursos) {
            System.out.println(curso.getNombre() + " - Código: "
                    + curso.getCodigo() + " - Créditos: "
                    + curso.getCreditos() + " - Profesor: "
                    + curso.getProfesor().getNombre() + " "
                    + curso.getProfesor().getApellido());
        }
    }
}
