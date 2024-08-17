import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;


public class SistemaApicola {
    private List<Colmena> colmenas;
    private List<Apicultor> apicultores;

    public SistemaApicola() {
        this.colmenas = new ArrayList<>();
        this.apicultores = new ArrayList<>();
    }

    public void registrarColmena(Colmena colmena) {
        colmenas.add(colmena);
    }

    public void registrarApicultor(Apicultor apicultor) {
        apicultores.add(apicultor);
    }

    public void registrarInspeccion(String idColmena, Inspeccion inspeccion) throws RegistroException {
        for (Colmena colmena : colmenas) {
            if (colmena.getId().equals(idColmena)) {
                colmena.agregarInspeccion(inspeccion);
                return;
            }
        }
        throw new RegistroException("Colmena no encontrada: " + idColmena);
    }

    public List<Colmena> getColmenas() {
        return colmenas;
    }

    public List<Apicultor> getApicultores() {
        return apicultores;
    }

    public Colmena buscarColmena(String id) {
        for (Colmena colmena : colmenas) {
            if (colmena.getId().equals(id)) {
                return colmena;

            }
        }
        return null;
    }
}