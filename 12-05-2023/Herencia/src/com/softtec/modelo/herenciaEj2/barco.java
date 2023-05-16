package com.softtec.modelo.herenciaEj2;

public class barco extends vehiculo {
    private double eslora;

    public barco(String marca, String modelo, int anio, double longitud) {
        super(marca, modelo, anio);
        this.eslora = longitud;
    }

    public double getLongitud() {
        return eslora;
    }

    public void setLongitud(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("BARCO");
        super.mostrarInformacion();
        System.out.println("Longitud: " + eslora);
    }


}

