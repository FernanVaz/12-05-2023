package com.softtec.modelo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String cadena = "Bienvenidos al curso de Java";


        String mayusculas = cadena.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + mayusculas);


        String minusculas = cadena.toLowerCase();
        System.out.println("Cadena en minúsculas: " + minusculas);


        String palabraBienvenidos = cadena.substring(0, 10);
        System.out.println("Palabra 'Bienvenidos': " + palabraBienvenidos);


        String palabraJava = cadena.substring(cadena.indexOf("Java"));
        System.out.println("Palabra 'Java': " + palabraJava);


        String palabraCurso = cadena.substring(17, 22);
        System.out.println("Palabra 'curso': " + palabraCurso);


        int posicionC = cadena.indexOf("c");
        System.out.println("Posición de 'c': " + posicionC);

        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);


        String reemplazoE = cadena.replace("e", "E");
        System.out.println("Cadena con E mayúscula: " + reemplazoE);


        String nuevaCadena = reemplazoE.concat(" con fecha 14 de Septiembre");
        System.out.println("Nueva cadena: " + nuevaCadena);
    }
}
