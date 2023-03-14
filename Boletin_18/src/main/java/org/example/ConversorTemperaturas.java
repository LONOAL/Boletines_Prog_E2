package org.example;

public class ConversorTemperaturas {
    final float T =80f;

    public float centigradosAFharenheit(float gradoscent)throws TemperaturaErradaExcepcion {

        if (gradoscent < T) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser inferior a 80º");

        } else {
            float gradosf = 9.0f / 5.0f * gradoscent + 32.4f;
            return gradosf;
        }
    }

    public void centígradosAReamur(float gradoscent) throws TemperaturaErradaExcepcion{
        if (gradoscent< T){
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser inferior a 80º");
        }else{
            float gradosr= 4.0f / 5.0f * gradoscent;
            System.out.println(gradosr);
        }
    }
}
