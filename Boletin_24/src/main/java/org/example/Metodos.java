package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.lorenzo.datos.getters;

public class Metodos {

    public ArrayList<Libro> engadir(ArrayList<Libro>lista){
        Libro lib = new Libro(getters.getString("titulo: "),getters.getString("autor: "),getters.getString("ISBN: "),getters.getFloat("prezo: "),getters.getInt("unidades: "));
        lista.add(lib);
        return lista;
    }
    public void amosar(ArrayList<Libro>lista) throws ExcepcionLibro{
        Collections.sort(lista);
        Iterator it= lista.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
    public void vender(ArrayList<Libro>lista){
        String tituloBorrar= getters.getString(" Introduce o titulo do libro a vender: ");
        Iterator it= lista.iterator();
        Libro lib;
        while(it.hasNext()){
            lib=(Libro)it.next();
            if(lib.getTitulo().equalsIgnoreCase(tituloBorrar))
                lib.setUnidades(lib.getUnidades()-1);
        }
        }

    public void actualizar(ArrayList<Libro>lista)throws ExcepcionLibro{
        Iterator it= lista.iterator();
        Libro lib;
        while(it.hasNext()){
            lib=(Libro)it.next();
            if (lib.getUnidades()<1)
                it.remove();
        }
    }

    public int buscarLibro(ArrayList<Libro>lista)throws ExcepcionLibro{
        String libBuscar= getters.getString(" Que libro buscas :");
        int atopado=0;//non se atopou
        for(Libro elemento:lista){
            if(elemento.getTitulo().equalsIgnoreCase(libBuscar)){
                System.out.println(elemento);
                atopado=1;
            }

        }
        if(atopado==0)
            System.out.println(" Ese libro non existe ");
        return atopado;
    }

}
