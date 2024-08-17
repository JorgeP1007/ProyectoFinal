public class InspeccionThread extends Thread {
    private Colmena colmena;
    private Inspeccion inspeccion;

    public InspeccionThread(Colmena colmena, Inspeccion inspeccion) {
        this.colmena = colmena;
        this.inspeccion = inspeccion;
    }

    @Override
    public void run() {
        colmena.agregarInspeccion(inspeccion);
        System.out.println("Inspección realizada en colmena: " + colmena.getId() + " con resultado: " + inspeccion.getResultado());
    }
}

