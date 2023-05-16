package com.softtec.modelo.herenciaEj2;

public class coche extends vehiculo{
        private int numeroPuertas;

        public coche(String marca, String modelo, int anio, int numeroPuertas) {
            super(marca, modelo, anio);
            this.numeroPuertas = numeroPuertas;
        }

        public int getNumeroPuertas() {
            return numeroPuertas;
        }

        public void setNumeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
        }

        @Override
        public void mostrarInformacion() {
            System.out.println("COCHE");
            super.mostrarInformacion();
            System.out.println("Número de puertas: " + numeroPuertas);
        }

        public void conducir() {
            System.out.println("Conduciendo el coche");
        }
}
