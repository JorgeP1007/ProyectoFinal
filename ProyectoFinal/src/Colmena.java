import java.util.List;
import java.util.ArrayList;

public class Colmena {
    private String id;
    private String ubicacion;
    private String estadoSalud;
    private int cantidadAbejas;
    private double produccionMiel;
    private AbejaReina abejaReina;
    private List<Inspeccion> historialInspecciones;

    public Colmena(String id, String ubicacion, String estadoSalud, int cantidadAbejas, double produccionMiel, AbejaReina abejaReina) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.estadoSalud = estadoSalud;
        this.cantidadAbejas = cantidadAbejas;
        this.produccionMiel = produccionMiel;
        this.abejaReina = abejaReina;
        this.historialInspecciones = new ArrayList<>();
    }

    public void agregarInspeccion(Inspeccion inspeccion) {
        historialInspecciones.add(inspeccion);
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getId() {
        return id;
    }

    public double getProduccionMiel() {
        return produccionMiel;
    }

    public List<Inspeccion> obtenerHistorialInspecciones() {
        return historialInspecciones;
    }
}
