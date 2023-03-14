package org.example;

public class Gato extends Mamiferos implements IPodeNadar{

    @Override
    public void camiñar() {
        System.out.println("El gato ");
        super.camiñar();
    }

    @Override
    public void nadar() {
        System.out.println("El gato nada");
    }}
