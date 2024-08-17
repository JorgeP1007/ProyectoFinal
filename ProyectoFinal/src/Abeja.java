public class Abeja {
    private String id;
    private String estadoSalud;

    public Abeja(String id, String estadoSalud) {
        this.id = id;
        this.estadoSalud = estadoSalud;
    }

    public String getId() {
        return id;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }
}
