package com.camilomorales.dominio;

public class Corredor {

    private String identificacionCM;
    private String nombreCM;
    private int edadCM;
    private char generoCM;


    public Corredor(String identificacionCM, String nombreCM) {
        this.identificacionCM = identificacionCM;
        this.nombreCM = nombreCM;
    }


    //Métodos





    //getters
    public String getIdentificacionCM() {
        return identificacionCM;
    }

    public String getNombreCM() {
        return nombreCM;
    }

    public int getEdadCM() {
        return edadCM;
    }

    public char getGeneroCM() {
        return generoCM;
    }



    //setters
    public void setEdadCM(int edadCM) {
        this.edadCM = edadCM;
    }

    public void setGeneroCM(char generoCM) {
        this.generoCM = generoCM;
    }
}
