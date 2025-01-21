import java.time.LocalDateTime;
import java.util.Date;

public class Nota {
    private int valor ;
    private LocalDateTime fecha ;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Nota(int valor, LocalDateTime fecha) {
        this.valor = valor;
        this.fecha = fecha;
    }
}