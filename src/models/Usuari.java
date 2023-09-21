package models;

public class Usuari {
    String id;
    String nom;
    String cognom;
    String email;
    String contrasena;
    String DNI;
    Integer numSS;
    Integer numM;
    Integer telefon;
    String nivellEmergencia;
    Integer diners;
    public Usuari() {}
    public Usuari(String id, String name, String surname, String email, String password, String DNI, String nivellEmergencia){
        this();
        this.id = id;
        this.nom = name;
        this.cognom = surname;
        this.email = email;
        this.contrasena = password;
        this.DNI = DNI;
        this.numSS= 000000000;
        this.numM = 000000000;
        this.nivellEmergencia = nivellEmergencia;
        this.diners = 123;
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

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getNumSS() {
        return numSS;
    }

    public void setNumSS(Integer numSS) {
        this.numSS = numSS;
    }

    public Integer getNumM() {
        return numM;
    }

    public void setNumM(Integer numM) {
        this.numM = numM;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public String getNivellEmergencia() {
        return nivellEmergencia;
    }

    public void setNivellEmergencia(String nivellEmergencia) {
        this.nivellEmergencia = nivellEmergencia;
    }
}

