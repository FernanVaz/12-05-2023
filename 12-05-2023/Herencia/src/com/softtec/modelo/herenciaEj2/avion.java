package com.softtec.modelo.herenciaEj2;

public class avion extends vehiculo {
    private int numeroMotores;

    public avion(String marca, String modelo, int anio, int numeroMotores) {
        super(marca, modelo, anio);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("AVION");
        super.mostrarInformacion();
        System.out.println("Número de motores: " + numeroMotores);
    }
}
