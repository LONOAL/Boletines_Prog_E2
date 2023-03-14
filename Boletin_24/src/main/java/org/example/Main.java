package org.example;

import com.lorenzo.datos.getters;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Libro> listaLib= new ArrayList<>();
        Metodos obx=new Metodos();
        int op;
        do {
            op = getters.getInt("**** MENU **** \n 1--> ENGADIR LIBRO \n 2--> AMOSAR \n 3-->VENDER \n 4--> ACTUALIZAR \n 5--> BUSCAR \nteclea una opcion : ");
            try {
                switch (op) {
                    case 1:
                        obx.engadir(listaLib);
                        break;
                    case 2:
                        obx.amosar(listaLib);
                        break;
                    case 3:
                        obx.vender(listaLib);
                        break;
                    case 4:
                        obx.actualizar(listaLib);
                        break;
                    case 5:
                        obx.buscarLibro(listaLib);
                        break;

                    default:
                        System.out.println(" OPCION INCORRECTA ");

                }
            } catch (ExcepcionLibro e) {
                System.out.println("No hay libros.");
            }

        }while(op<=5);
    }
}