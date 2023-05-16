package com.softtec.modelo.Ejercicio1;

abstract class Planta {
    private String nombre;
    private String especie;
    private int altura;
    private boolean tieneFlores;
    public  Planta(String nombre , String especie , int altura,boolean tieneFlores){
        this.nombre = nombre;
        this.especie = especie;
        this.altura = altura;
        this.tieneFlores = tieneFlores;
    };

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getAltura() {
        return altura;
    }

    public boolean isTieneFlores() {
        return tieneFlores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setTieneFlores(boolean tieneFlores) {
        this.tieneFlores = tieneFlores;
    }

    public abstract void regar(int cantidad, int tiempo);
}
