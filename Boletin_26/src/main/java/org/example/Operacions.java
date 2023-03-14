package org.example;


import java.util.ArrayList;
import java.util.Collections;


public class Operacions <T>{

    //metodos
    public <T> void engadir(T elemento, ArrayList<T> lista){
        lista.add(elemento);
    }

    public <T> void elementoMinimo(ArrayList<T> aux){
        System.out.println("\nElemento mínimo: " + Collections.min(aux, null));
    }

    public <T> void elementoMaximo(ArrayList<T> aux){
        System.out.println("\nElemento máximo: " + Collections.max(aux, null));
    }

    public <T> int buscarElemento(ArrayList<T> aux, T buscar){
        int posicion = -1;
        if(aux.contains(buscar)){
            posicion = aux.indexOf(buscar)+1;
            System.out.println("\nO numero: " + buscar + " aparace na posición: " + posicion);
        }
        else{
            posicion = -1;
            System.out.println("\nO numero: " + buscar + " no aparece: " + posicion);
        }
        return posicion;
    }

    public <T> void borrar(ArrayList<T> aux, T elemento){
        int pos = buscarElemento(aux,elemento);
        T ele;
        if(pos>-1){
            ele = aux.get(pos);
            aux.remove(pos);
            System.out.println("\nO elemento borrado é " + ele);
        }
        else{
            System.out.println("\nNon se pode borrar, no está o elemento ");
        }

    }
}