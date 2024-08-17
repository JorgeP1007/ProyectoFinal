import java.io.*;
import java.util.List;

public class ManejoArchivos {

    public static void guardarDatos(List<Colmena> colmenas, String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(colmenas);
        }
    }

    public static List<Colmena> cargarDatos(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Colmena>) ois.readObject();
        }
    }
}
