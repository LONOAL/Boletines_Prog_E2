package org.example;

public class Persoa implements IPodeCantar{
    @Override
    public void cantar() {
        System.out.println("La persona canta Do, Re, Mi, Fa, So, La, Si, Do");
    }
}
