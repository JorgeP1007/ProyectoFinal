public class AbejaReina extends Abeja {
    private int edad;
    private double productividad;

    public AbejaReina(String id, String estadoSalud, int edad, double productividad) {
        super(id, estadoSalud);
        this.edad = edad;
        this.productividad = productividad;
    }

    public int getEdad() {
        return edad;
    }

    public double getProductividad() {
        return productividad;
    }

}

