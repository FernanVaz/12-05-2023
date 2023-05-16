package com.softtec.modelo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String cadena = "Bienvenidos al curso de Java";

        // Mostrar la cadena toda en mayúsculas
        String mayusculas = cadena.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + mayusculas);

        // Mostrar la cadena en minúsculas
        String minusculas = cadena.toLowerCase();
        System.out.println("Cadena en minúsculas: " + minusculas);

        // Mostrar solo la palabra "Bienvenidos"
        String palabraBienvenidos = cadena.substring(0, 10);
        System.out.println("Palabra 'Bienvenidos': " + palabraBienvenidos);

        // Mostrar solo la palabra "Java"
        String palabraJava = cadena.substring(cadena.indexOf("Java"));
        System.out.println("Palabra 'Java': " + palabraJava);

        // Mostrar la palabra "curso"
        String palabraCurso = cadena.substring(17, 22);
        System.out.println("Palabra 'curso': " + palabraCurso);

        // Mostrar la posición de la letra "c"
        int posicionC = cadena.indexOf("c");
        System.out.println("Posición de 'c': " + posicionC);

        // Devolver la longitud de la cadena
        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // Modificar las e minúsculas por E mayúsculas
        String reemplazoE = cadena.replace("e", "E");
        System.out.println("Cadena con E mayúscula: " + reemplazoE);

        // Concatenar la frase anterior con "con fecha 14 de Septiembre"
        String nuevaCadena = reemplazoE.concat(" con fecha 14 de Septiembre");
        System.out.println("Nueva cadena: " + nuevaCadena);
    }
}
