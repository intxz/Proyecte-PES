package models;
public class Missatges {
    String missatge;
    public String getMissatge() {
        return missatge;
    }
    public void setMissatge(String missatge) {
        this.missatge = missatge;
    }
    public Missatges(){
    }
    public Missatges(String message){
        setMissatge(message);
    }
}