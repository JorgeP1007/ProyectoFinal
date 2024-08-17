import java.util.regex.Pattern;

public class Validador {
    public static boolean validarId(String id) {
        return Pattern.matches("[A-Z]{3}\\d{3}", id);
    }

    public static boolean validarNombre(String nombre) {
        return Pattern.matches("^[A-Za-z\\s]+$", nombre);
    }

    public static boolean validarTelefono(String telefono) {
        return Pattern.matches("^\\d{10}$", telefono);
    }
}
