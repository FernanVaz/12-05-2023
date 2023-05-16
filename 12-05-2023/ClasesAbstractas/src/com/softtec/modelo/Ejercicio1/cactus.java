package com.softtec.modelo.Ejercicio1;

public class cactus extends Planta{
    private final boolean tieneEspinas;

    public cactus(String nombre, int altura, boolean tieneEspinas) {
        super(nombre, "cactáceas",altura,false);
        this.tieneEspinas = tieneEspinas;
    }
    public boolean isTieneEspinas() {
        return tieneEspinas;
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando el cactus " + getNombre() + " con " + cantidad + " ml de agua durante " + tiempo + " minutos");
    }
}
