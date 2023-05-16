package com.softtec.modelo.herenciaEj2;

public class vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    // Constructor por defecto
    public vehiculo() {
    }

    // Constructor con parámetros
    public vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Métodos getter y setter para las propiedades
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método para mostrar información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}
