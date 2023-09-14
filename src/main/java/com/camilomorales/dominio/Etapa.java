package com.camilomorales.dominio;

public class Etapa {

    private int numeroEtapaCM;
    private int distanciaCM;
    private Equipo equipoCM;


    public Etapa(int numeroEtapaCM, int distanciaCM) {
        this.numeroEtapaCM = numeroEtapaCM;
        this.distanciaCM = distanciaCM;
    }




    //Métodos
    public void resultadosEtapa(){
        
    }



    //getters

    public int getNumeroEtapaCM() {
        return numeroEtapaCM;
    }

    public int getDistanciaCM() {
        return distanciaCM;
    }

    public Equipo getEquipoCM() {
        return equipoCM;
    }


    //setters

    public void setDistanciaCM(int distanciaCM) {
        this.distanciaCM = distanciaCM;
    }

    public void setEquipoCM(Equipo equipoCM) {
        this.equipoCM = equipoCM;
    }
}
