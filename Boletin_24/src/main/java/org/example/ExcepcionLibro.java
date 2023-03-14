package org.example;

public class ExcepcionLibro extends Exception{
    public ExcepcionLibro() {
        super();
    }
    public ExcepcionLibro(String mensaxe){
        super(mensaxe);
    }
}
