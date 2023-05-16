package com.softtec.presentacion;

import com.softtec.modelo.Ejercicio2.*;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.comer();
        perro.moverse();

        Pez pez = new Pez();
        pez.comer();
        pez.moverse();

        Pajaro pajaro = new Pajaro();
        pajaro.comer();
        pajaro.moverse();

        Gusano gusano = new Gusano();
        gusano.comer();
        gusano.moverse();

        Gorrión gorrión = new Gorrión();
        gorrión.comer();
        gorrión.moverse();
        gorrión.construirNido();

        Buitre buitre = new Buitre();
        buitre.comer();
        buitre.moverse();
        buitre.buscarCarroña();
    }
}
/*
Ahora, en cuanto a tus preguntas:
        1.¿Qué ocurre si no implemento todos los métodos?
            Si no implementas todos los métodos abstractos de la clase abstracta, recibirás un error
            en tiempo de ejecución cuando intentes crear una instancia de esa clase.
            El error te indicará que la clase es abstracta y que algunos métodos no se han implementado.

        2.¿Puedo crear instancias igualmente?
            No puedes crear instancias directamente de una clase abstracta. La intención de una clase
            abstracta es proporcionar una base para que otras clases la hereden y definan sus propias
            implementaciones para los métodos abstractos. Puedes crear instancias de las clases que
            hereden de la clase abstracta y hayan implementado todos los métodos abstractos.

        3.¿Puedo modificar parte de la definición de los métodos abstractos?
            Cuando heredas de una clase abstracta, puedes modificar la implementación de los métodos
            abstractos según sea necesario en las clases derivadas. Esto significa que puedes cambiar
            la lógica interna de los métodos, pero debes mantener la misma firma (nombre y parámetros)
            para cumplir con la definición del método abstracto en la clase base.
        4.¿Puedo utilizar polimorfismo?
            Sí, el polimorfismo es una característica clave de la programación orientada a objetos.
            Puedes utilizar polimorfismo al tratar diferentes objetos que heredan de la misma clase abstracta
            como si fueran del mismo tipo. Esto te permite escribir código genérico que
            pueda trabajar con diferentes tipos de animales, pero se comporta de manera diferente
            según la implementación específica de cada animal.

*/