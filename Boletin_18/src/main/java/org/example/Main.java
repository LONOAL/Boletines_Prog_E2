package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ConversorTemperaturas obj = new ConversorTemperaturas();
        float temperatura= Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura"));

        try{
            System.out.println("La temperatura es: "+temperatura+"ºC"+"\n En Fharenheit es: "+obj.centigradosAFharenheit(temperatura)+"ºF");
            obj.centígradosAReamur(temperatura);
        }
        catch (TemperaturaErradaExcepcion e){
            System.out.println(" No puede ser inferior a la temperatura "+e.toString());
        }
    }
}