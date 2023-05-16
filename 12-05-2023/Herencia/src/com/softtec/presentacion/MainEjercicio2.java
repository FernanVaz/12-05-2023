package com.softtec.presentacion;

import com.softtec.modelo.herenciaEj2.avion;
import com.softtec.modelo.herenciaEj2.barco;
import com.softtec.modelo.herenciaEj2.coche;
import com.softtec.modelo.herenciaEj2.tren;

public class MainEjercicio2 {
    public static void main(String[] args) {
        coche coche = new coche("Ford", "Focus", 2021, 4);
        barco barco = new barco("YAMAHA", "CHANQUETE", 2021,10.5);
        avion avion = new avion("Boeing", "747", 2010, 4);
        tren tren = new tren("Renfe", "AVE", 2022, 12);
        coche.mostrarInformacion();
        System.out.println("------------------------------------------------");
        barco.mostrarInformacion();
        System.out.println("------------------------------------------------");
        avion.mostrarInformacion();
        System.out.println("------------------------------------------------");
        tren.mostrarInformacion();
    }
}
