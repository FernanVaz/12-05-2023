package com.softtec.modelo.Ejercicio2;

public class Gorrión extends Pajaro {
    public void comer() {
        System.out.println("El gorrión está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El gorrión está volando.");
    }

    public void construirNido() {
        System.out.println("El gorrión está construyendo un nido.");
    }

}
