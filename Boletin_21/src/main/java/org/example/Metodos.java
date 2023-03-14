package org.example;

import java.util.Random;
import java.util.Scanner;

public class Metodos {

    public void arrayAleatorio(){
        int[] aleatorio= new int[6];

        for (int i=0;i< aleatorio.length;i++){
        aleatorio[i]= (int) (Math.random()*50+1);
        }

        for (int i= aleatorio.length-1;i>=0;i--){
            System.out.println(aleatorio[i]);
        }
    }

    public void arrayNotas(){
        int notas[] = new int[10];
        int aprobados=0;
        int suspensos=0;
        int notamax=0;
        int media=0;
        int acum=0;

        for (int i=0;i< notas.length;i++){
            notas[i]= (int) (Math.random()*10+1);
            if (notas[i]>notamax){
                notamax=notas[i];
            }
            if (notas[i]>=5){
                aprobados++;
            }
            if (notas[i]<5){
                suspensos++;
            }
            acum=acum+notas[i];

        }
        for (int i= notas.length-1;i>=0;i--){
            System.out.println(notas[i]);
        }
        media=acum/notas.length;
        System.out.println("n aprobados: "+aprobados);
        System.out.println("n suspensos: "+suspensos);
        System.out.println("nota max: "+notamax);
        System.out.println("media: "+media);
    }
    public void arrayNotas2(){
        int[] notas = new int[30];
        String[] nomes = new String[30];
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextInt(11);
            nomes[i] = "Alumno " + (i + 1);
        }

        // Numero de aprobados y suspensos
        int aprobados = 0, suspensos = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);

                // Nota media
        double media = 0;
        for (int nota : notas) {
            media += nota;
        }
        media /= notas.length;
        System.out.println("Media: " + media);

        // Nota maxima
        int maxNota = notas[0];
        for (int nota : notas) {
            if (nota > maxNota) {
                maxNota = nota;
            }
        }
        System.out.println("Nota mais alta: " + maxNota);

        // Nota de un alumno especifico
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do alumno: ");
        String nomeAluno = sc.nextLine();
        int indice = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeAluno)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            System.out.println("Nota do alumno: " + notas[indice]);
        } else {
            System.out.println("Alumno non atopado.");
        }

        // Lista de los alumnos aprobados
        System.out.print("Alumnos aprobados: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.print(nomes[i] + " ");
            }
        }
        System.out.println();

        // Nombres y notas ordenadas ascendentemente
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    int tempNota = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tempNota;

                    String tempNome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = tempNome;
                }
            }
        }
        System.out.print("Notas ordenadas: ");
        for (int nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.print("Nomes ordenados: ");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();

        //Notas por alumno (input)
        System.out.print("Nome do alumno: ");
        nomeAluno = sc.nextLine();
        indice = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeAluno)) {
                indice = i;
                break;
            }
        }
        if (indice != -1){
        System.out.println("Nota do alumno: " + notas[indice]);
    } else {
        System.out.println("Alumno non atopado.");
    }

    }




}
