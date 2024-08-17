import java.util.ArrayList;
import java.util.List;

public class HistorialInspeccion {
    private List<Inspeccion> inspecciones;

    public HistorialInspeccion() {
        this.inspecciones = new ArrayList<>();
    }

    public void agregarInspeccion(Inspeccion inspeccion) {
        inspecciones.add(inspeccion);
    }

    public List<Inspeccion> obtenerHistorial() {
        return inspecciones;
    }
}

