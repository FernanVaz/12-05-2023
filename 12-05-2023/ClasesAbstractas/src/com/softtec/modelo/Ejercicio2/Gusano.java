package com.softtec.modelo.Ejercicio2;

public class Gusano extends Animal {
    @Override
    public void comer() {
        System.out.println("El gusano está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El gusano está arrastrándose.");
    }
}
