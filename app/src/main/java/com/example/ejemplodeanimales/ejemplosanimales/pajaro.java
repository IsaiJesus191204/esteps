package com.example.ejemplodeanimales.ejemplosanimales;

public class pajaro extends animales {
    public pajaro(String nombre) {
        super(nombre);
    }

    //Implementación específica del método "hacerSonido()" para el pájaro
    @Override
    public void hacerSonido() {
        System.out.println("El pájaro hace: Pio Pio");
    }
}
