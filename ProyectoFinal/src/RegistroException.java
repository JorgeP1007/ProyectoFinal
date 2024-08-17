public class RegistroException extends Exception {

    // Constructor por defecto
    public RegistroException() {
        super("Error en el registro de datos.");
    }

    // Constructor que acepta un mensaje personalizado
    public RegistroException(String message) {
        super(message);
    }

    // Constructor que acepta un mensaje y una causa
    public RegistroException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor que acepta una causa
    public RegistroException(Throwable cause) {
        super(cause);
    }
}

