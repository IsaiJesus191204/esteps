package com.example.ejemplodeanimales.ejemplosanimales;

public class animales {
    public String nombre;
    public animales(String nombre) {
        this.nombre = nombre;
    }

    public animales() {

    }
    public String getNombre() {
        return nombre;
    }   
    public void hacerSonido() {
        System.out.println("Un animal haciendo un ruido");
    }
}



