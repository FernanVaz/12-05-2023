package com.softtec.modelo.Ejercicio2;

public class Buitre extends Pajaro {
    public void comer() {
        System.out.println("El buitre está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El buitre está volando en círculos.");
    }

    public void buscarCarroña() {
        System.out.println("El buitre está buscando carroña.");
    }
}