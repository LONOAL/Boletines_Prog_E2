package org.example;

import com.lorenzo.datos.getters;

public class Main {
    public static void main(String[] args) {
        int num;

        Metodos obx = new Metodos();
        int [][]auxGoles = null;
        int []auxXornadas;
        auxGoles = obx.crearArrayGoles();
        auxXornadas = obx.crearXornadas();
        do{
            num = getters.getInt("1. Ver tabla\n2. Ordenar por goles máximos");
            switch(num){
                case 1:
                    obx.verTabla(auxXornadas, obx.equipos, auxGoles);
                    break;
                case 2:
                    obx.ordenarTabla(obx.equipos, auxGoles);
                    break;
                case 3:
                    obx.verMaximoGoleadorXornada(obx.equipos, auxXornadas, auxGoles);
                    break;
                case 5:
                    obx.verEquipoXornadaPorGoles(obx.equipos, auxXornadas, auxGoles);
                    break;
            }
        }while(num>0);
    }
}