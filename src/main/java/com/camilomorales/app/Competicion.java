package com.camilomorales.app;

import com.camilomorales.dominio.Competencia;
import com.camilomorales.dominio.Corredor;
import com.camilomorales.dominio.Equipo;
import com.camilomorales.dominio.Etapa;

public class Competicion {
    public static void main(String[] args) {

        Competencia miCompetencia = new Competencia("Maraton Oriente");


        //Corredores
        Corredor corredor1 = new Corredor("1","Camilo");
        Corredor corredor2 = new Corredor("2","Andrés");
        Corredor corredor3 = new Corredor("3","Santiago");
        Corredor corredor4 = new Corredor("4","Alejandro");
        Corredor corredor5 = new Corredor("5","Esteban");
        Corredor corredor6 = new Corredor("6","Victor");
        Corredor corredor7 = new Corredor("7","Juan");
        Corredor corredor8 = new Corredor("8","Lucas");
        Corredor corredor9 = new Corredor("9","Sebastian");
        Corredor corredor10 = new Corredor("10","Nicolas");
        Corredor corredor11 = new Corredor("11","Hector");
        Corredor corredor12 = new Corredor("12","Jesus");
        Corredor corredor13 = new Corredor("13","Pedro");
        Corredor corredor14 = new Corredor("14","Manuel");
        Corredor corredor15 = new Corredor("15","Miguel");
        Corredor corredor16 = new Corredor("16","Sergio");
        Corredor corredor17 = new Corredor("17","Edgar");
        Corredor corredor18 = new Corredor("18","Julio");
        Corredor corredor19 = new Corredor("19","Cristian");
        Corredor corredor20 = new Corredor("20","Stiven");
        Corredor corredor21 = new Corredor("21","Alfredo");
        Corredor corredor22 = new Corredor("22","Jose");
        Corredor corredor23 = new Corredor("23","Felipe");
        Corredor corredor24 = new Corredor("24","Alvaro");
        Corredor corredor25 = new Corredor("25","Carlos");
        Corredor corredor26 = new Corredor("26","Ejemplo"); // Ejemplo para que no agrege mas de 5



        //Equipos

        //Equipo1
        Equipo equipo1 = new Equipo("Marinilla");
        equipo1.agregarCorredor(corredor1);
        equipo1.agregarCorredor(corredor2);
        equipo1.agregarCorredor(corredor3);
        equipo1.agregarCorredor(corredor4);
        equipo1.agregarCorredor(corredor5);


        //Equipo2
        Equipo equipo2 = new Equipo("Rionegro");
        equipo2.agregarCorredor(corredor6);
        equipo2.agregarCorredor(corredor7);
        equipo2.agregarCorredor(corredor8);
        equipo2.agregarCorredor(corredor9);
        equipo2.agregarCorredor(corredor10);


        //Equipo3
        Equipo equipo3 = new Equipo("La Ceja");
        equipo3.agregarCorredor(corredor11);
        equipo3.agregarCorredor(corredor12);
        equipo3.agregarCorredor(corredor13);
        equipo3.agregarCorredor(corredor14);
        equipo3.agregarCorredor(corredor15);


        //Equipo4
        Equipo equipo4 = new Equipo("El Carmen");
        equipo4.agregarCorredor(corredor16);
        equipo4.agregarCorredor(corredor17);
        equipo4.agregarCorredor(corredor18);
        equipo4.agregarCorredor(corredor19);
        equipo4.agregarCorredor(corredor20);


        //Equipo5
        Equipo equipo5 = new Equipo("Guarne");
        equipo5.agregarCorredor(corredor21);
        equipo5.agregarCorredor(corredor22);
        equipo5.agregarCorredor(corredor23);
        equipo5.agregarCorredor(corredor24);
        equipo5.agregarCorredor(corredor25);
        equipo5.agregarCorredor(corredor26); // Ejemplo para que no agrege más de 5 corredores

        Equipo equipo6 = new Equipo("Medellin"); // Ejemplo para que no agrege más de 5 equipos



        //Competencia
        miCompetencia.agregarEquipo(equipo1);
        miCompetencia.agregarEquipo(equipo2);
        miCompetencia.agregarEquipo(equipo3);
        miCompetencia.agregarEquipo(equipo4);
        miCompetencia.agregarEquipo(equipo5);
        miCompetencia.agregarEquipo(equipo6); // Ejemplo para que no agrege más de 5 equipos


        //Etapas
        Etapa etapa1 = new Etapa(1,10);
        Etapa etapa2 = new Etapa(2,20);
        Etapa etapa3 = new Etapa(3,30);
        Etapa etapa4 = new Etapa(4,40);
        Etapa etapa5 = new Etapa(5,50);
        Etapa etapa6 = new Etapa(6,60);
        Etapa etapa7 = new Etapa(7,70);
        Etapa etapa8 = new Etapa(8,80);
        Etapa etapa9 = new Etapa(9,90);
        Etapa etapa10 = new Etapa(10,100);
        Etapa etapa11 = new Etapa(11,110); //Ejemplo para que no agregue mas de 10 etapas

        miCompetencia.agregarEtapa(etapa1);
        miCompetencia.agregarEtapa(etapa2);
        miCompetencia.agregarEtapa(etapa3);
        miCompetencia.agregarEtapa(etapa4);
        miCompetencia.agregarEtapa(etapa5);
        miCompetencia.agregarEtapa(etapa6);
        miCompetencia.agregarEtapa(etapa7);
        miCompetencia.agregarEtapa(etapa8);
        miCompetencia.agregarEtapa(etapa9);
        miCompetencia.agregarEtapa(etapa10);
        miCompetencia.agregarEtapa(etapa11); //Ejemplo para que no agregue mas de 10 etapas



        //Equipos de la competencia
        miCompetencia.todosEquipos();


        //Corredores por equipo
        equipo1.todosCorredores();
        equipo2.todosCorredores();
        equipo3.todosCorredores();
        equipo4.todosCorredores();
        equipo5.todosCorredores();



        //Tabla Posiciones
        miCompetencia.tablaPosiciones();
    }
}
