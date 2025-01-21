public class Persona {
    private String nombre ;
    private String apellido ;
    private String ID ;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
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
    public Persona(String nombre, String apellido, String ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }


}
