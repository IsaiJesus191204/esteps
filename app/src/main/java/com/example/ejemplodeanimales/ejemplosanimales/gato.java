package com.example.ejemplodeanimales.ejemplosanimales;
public class gato extends animales {
    public gato(String nombre) {
        super(nombre);
    }

    //Implementación específica del método "hacerSonido()" para el gato
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: Miau Miau");
    }
}
