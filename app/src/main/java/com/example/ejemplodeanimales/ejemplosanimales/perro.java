package com.example.ejemplodeanimales.ejemplosanimales;

public class perro extends animales {
    public perro(String nombre) {
        super(nombre);
    }

    //Implementación específica del método "hacerSonido()" para el perro
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: Guau Guau");
    }
}
