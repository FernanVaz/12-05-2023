package com.softtec.modelo.herenciaEj1;

 public class Figura {
    private int coordenadaX;
    private int coordenadaY;


    public Figura(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String posicion() {
        return "Posición: (" + coordenadaX + ", " + coordenadaY + ")";
    }
}
