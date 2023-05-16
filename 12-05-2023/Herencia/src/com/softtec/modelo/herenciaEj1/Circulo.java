package com.softtec.modelo.herenciaEj1;

public class Circulo extends Figura{
    private double radio;

    public Circulo(int coordenadaX, int coordenadaY, double radio) {
        super(coordenadaX, coordenadaY);
        this.radio = radio;
    }

    public String posicion() {
        return "Círculo - " + super.posicion();
    }
}
