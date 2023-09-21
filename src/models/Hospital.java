package models;

public class Hospital {
    String id;
    String nom;
    String ubi;

    public Hospital(){}
    public Hospital(String email, String password, String ubi){
        this.id = email;
        this.nom = password;
        this.ubi = ubi;
    }
    public String getId()
    {
        return id;
    }

    public String getNom()
    {
        return nom;
    }
    public String getUbi(String ubi)
    {
        return ubi;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setUbi(String ubi){
        this.ubi = ubi;
    }
}
