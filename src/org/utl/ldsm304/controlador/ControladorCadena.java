
package org.utl.ldsm304.controlador;

import java.util.Scanner;


public class ControladorCadena {
   
    //mtodos

    public String[][] generarArreglo(int filas, int columnas) {
        Scanner sc = new Scanner(System.in);
        String[][] arreglo = new String[filas][columnas];
        System.out.println("Ingrese las palabras para el arreglo:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Palabra [" + i + "][" + j + "]: ");
                arreglo[i][j] = sc.nextLine();
            }
        }
        return arreglo;
    }

    public void mostrarCadenasConO(String[][] arreglo) {
        System.out.println("\nCadenas que comienzan con 'o':");
        for (String[] fila : arreglo) {
            for (String palabra : fila) {
                if (palabra.toLowerCase().startsWith("o")) {
                    System.out.println(palabra);
                }
            }
        }
    }

    public void mostrarCadenaVocales(String[][] arreglo) {
        System.out.println("\nCadena con todas las vocales:");
        boolean encontrada = false;
        for (String[] fila : arreglo) {
            for (String palabra : fila) {
                String lower = palabra.toLowerCase();
                if (lower.contains("a") && lower.contains("e") && lower.contains("i")
                        && lower.contains("o") && lower.contains("u")) {
                    System.out.println(palabra);
                    encontrada = true;
                }
            }
        }
        if (!encontrada) {
            System.out.println("No encontrada");
        }
    }

    public void mostrarCadenasConSa(String[][] arreglo) {
        System.out.println("\nCadenas que contienen 'sa':");
        for (String[] fila : arreglo) {
            for (String palabra : fila) {
                if (palabra.toLowerCase().contains("sa")) {
                    System.out.println(palabra);
                }
            }
        }
    }
}

