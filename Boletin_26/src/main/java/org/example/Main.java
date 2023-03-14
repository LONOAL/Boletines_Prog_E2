package org.example;

import com.lorenzo.datos.getters;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Operacions<Integer> obx = new Operacions();
        int opcion;
        ArrayList<Integer> lista= new ArrayList();
        do{
            opcion = getters.getInt("1 --> Añadir\n2 --> Elemento mínimo\n3 --> Elemento máximo\n4 --> Buscar elemento\n5 --> Borrar primer elemento");
            switch(opcion){
                case 1:
                    int num = getters.getInt("Cuantos numeros quieres añadir?");
                    for(int i = 0; i < num; i++){
                        obx.engadir(getters.getInt("Teclee un numero"), lista);
                    }
                    break;
                case 2:
                    obx.elementoMinimo(lista);
                    break;
                case 3:
                    obx.elementoMaximo(lista);
                    break;
                case 4:
                    int posicion = obx.buscarElemento(lista, getters.getInt("Teclee o numero a buscar"));
                    if(posicion == -1){
                        System.out.println("");
                    }
                    break;
                case 5:
                    obx.borrar(lista, getters.getInt("Teclee o numero a borrar"));
                    break;
                default:
                    System.out.println("Saíndo do programa");
                    break;
            }
        }while(opcion > 0 && opcion < 6);
    }

}