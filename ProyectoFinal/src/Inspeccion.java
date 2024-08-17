import java.time.LocalDate;

public class Inspeccion {
    private LocalDate fecha;
    private String resultado;
    private String acciones;

    public Inspeccion(LocalDate fecha, String resultado, String acciones) {
        this.fecha = fecha;
        this.resultado = resultado;
        this.acciones = acciones;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public String getAcciones() {
        return acciones;
    }
}
