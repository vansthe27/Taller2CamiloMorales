package com.camilomorales.dominio;

import java.util.ArrayList;
import java.util.List;

public class Competencia {

    private String nombreCM;
    private List<Equipo> equiposCM;
    private List<Etapa> etapasCM;


    public Competencia(String nombreCM) {
        this.nombreCM = nombreCM;
        this.equiposCM = new ArrayList<>();
        this.etapasCM = new ArrayList<>();
    }


    //Métodos
    public void agregarEquipo(Equipo equipo){
        if (equiposCM.size() < 5) {
            equiposCM.add(equipo);
        } else {
            System.out.println("La competencia ya tiene 5 equipos. No se pueden agregar más.");
        }
    }
    

    public void agregarEtapa(Etapa etapa) {
        if (etapasCM.size() < 10) {
            etapasCM.add(etapa);
        } else {
            System.out.println("La competencia ya tiene 10 etapas. No se pueden agregar más.");
        }
    }


    public void todosEquipos() {
        System.out.println("\nEquipos en la competencia: \n");
        for (Equipo equipo : equiposCM) {
            System.out.println(equipo.getNombreCM());
        }
    }


    public void tablaPosiciones() {
        System.out.println("\nTabla de posiciones: \n");
        for (Equipo equipo : equiposCM) {
            System.out.println(equipo.getNombreCM());
        }
        double equiposCM = Math.round(Math.random()*10);
        System.out.println("La tabla de posiciones es: "+equiposCM);
    }




    //getters

    public String getNombreCM() {
        return nombreCM;
    }

    public List<Equipo> getEquiposCM() {
        return equiposCM;
    }

    public List<Etapa> getEtapasCM() {
        return etapasCM;
    }


    //setters

    public void setEquiposCM(List<Equipo> equiposCM) {
        this.equiposCM = equiposCM;
    }

    public void setEtapasCM(List<Etapa> etapasCM) {
        this.etapasCM = etapasCM;
    }
}
