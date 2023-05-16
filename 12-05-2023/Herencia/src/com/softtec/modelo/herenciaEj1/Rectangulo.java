package com.softtec.modelo.herenciaEj1;

public class Rectangulo extends Figura{

    private double ancho;
    private double alto;

    public Rectangulo(int coordenadaX, int coordenadaY, double ancho, double alto) {
        super(coordenadaX, coordenadaY);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String posicion() {
        return "Rectángulo - " + super.posicion();
    }

}
