import java.util.ArrayList;
import java.util.List;

public class Apicultor {
    private String id;
    private String nombre;
    private String telefono;
    private List<Colmena> colmenas;

    public Apicultor(String id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.colmenas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }
}


