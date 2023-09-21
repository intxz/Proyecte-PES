package models;

public class MetgeSS {
    String id;
    String nom;
    String despatx;
    String branca;
    String disponibilitat;
    public MetgeSS() {}
    public MetgeSS(String id, String nom, String despatx, String branca, String disponibilitat)
    {
        this.id = id;
        this.nom = nom;
        this.despatx = despatx;
        this.branca = branca;
        this.disponibilitat = disponibilitat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDespatx() {
        return despatx;
    }

    public void setDespatx(String despatx) {
        this.despatx = despatx;
    }

    public String getBranca() {
        return branca;
    }

    public void setBranca(String branca) {
        this.branca = branca;
    }

    public String getDisponibilitat() {
        return disponibilitat;
    }

    public void setDisponibilitat(String disponibilitat) {
        this.disponibilitat = disponibilitat;
    }
}
