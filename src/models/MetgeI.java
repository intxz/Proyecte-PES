package models;

public class MetgeI {
    String id;
    String idI;
    String idU;
    String nomProblema;
    String descripcio;
    public MetgeI() {}
    public MetgeI(String id, String idI, String idU, String nomProblema, String descripcio)
    {
        this.id = id;
        this.idI = idI;
        this.idU = idU;
        this.nomProblema = nomProblema;
        this.descripcio = descripcio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdI() {
        return idI;
    }

    public void setIdI(String idI) {
        this.idI = idI;
    }

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU;
    }

    public String getNomProblema() {
        return nomProblema;
    }

    public void setNomProblema(String nomProblema) {
        this.nomProblema = nomProblema;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
}
