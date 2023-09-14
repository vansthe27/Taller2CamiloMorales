package com.camilomorales.dominio;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombreCM;
    private List<Corredor> corredoresCM;


    public Equipo(String nombreCM) {
        this.nombreCM = nombreCM;
        this.corredoresCM = new ArrayList<>();
    }


    //Métodos
    public void agregarCorredor(Corredor corredor) {
        if (corredoresCM.size() < 5) {
            corredoresCM.add(corredor);
        } else {
            System.out.println("El equipo ya tiene 5 corredores. No se puede agregar más.");
        }
    }


    public void todosCorredores() {
        System.out.println("\nCorredores del equipo: "+getNombreCM());
        for (Corredor corredor : corredoresCM) {
            System.out.println(corredor.getNombreCM());
        }
    }




    //getters
    public String getNombreCM() {
        return nombreCM;
    }

    public List<Corredor> getCorredoresCM() {
        return corredoresCM;
    }


    //setters
    public void setCorredoresCM(List<Corredor> corredoresCM) {
        this.corredoresCM = corredoresCM;
    }
}
