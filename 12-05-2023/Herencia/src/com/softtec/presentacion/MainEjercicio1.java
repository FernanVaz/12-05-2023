package com.softtec.presentacion;

import com.softtec.modelo.herenciaEj1.Circulo;
import com.softtec.modelo.herenciaEj1.Figura;
import com.softtec.modelo.herenciaEj1.Rectangulo;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Figura figura = new Figura(10, 20);
        Circulo círculo = new Circulo(30, 40, 5.0);
        Rectangulo rectángulo = new Rectangulo(50, 60, 8.0, 12.0);

        System.out.println(figura.posicion());
        System.out.println(círculo.posicion());
        System.out.println(rectángulo.posicion());
    }
}
