package com.softtec.modelo.Ejercicio2;

public class Pajaro extends Animal {
    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El pájaro está volando.");
    }
}