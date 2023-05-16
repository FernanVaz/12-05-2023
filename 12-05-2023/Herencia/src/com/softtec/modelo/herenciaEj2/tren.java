package com.softtec.modelo.herenciaEj2;

public class tren extends vehiculo {
    private int numeroVagones;

    public tren(String marca, String modelo, int anio, int numeroVagones) {
        super(marca, modelo, anio);
        this.numeroVagones = numeroVagones;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("TREN");
        super.mostrarInformacion();
        System.out.println("Número de vagones: " + numeroVagones);
    }
}
