package models;

public class FAQ {
    private String preguntes;
    private String respostes;
    public  FAQ(){}
    public FAQ(String question, String answer) {
        this.preguntes = question;
        this.respostes = answer;
    }
    public String getPreguntes() {
        return preguntes;
    }
    public void setPreguntes(String preguntes) {
        this.preguntes = preguntes;
    }
    public String getRespostes() {
        return respostes;
    }
    public void setRespostes(String respostes) {
        this.respostes = respostes;
    }
}
