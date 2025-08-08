/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.controlador;

import java.util.Scanner;

/**
 *
 * @author IRIS
 */
public class Controlador {

    //aki metodo ejecutar con menu
     public void ejecutar() {
        Scanner leer = new Scanner(System.in);

        
        //generar arreglo
        int arreglo [][]= generarArreglo(3, 3);
        
        char opcion;
        do {
            System.out.println("\n MENU EJERCICIO 1 ---");
            System.out.println("a) Obtener el número que más se repite");
            System.out.println("b) Obtener la cantidad de números pares ");
            System.out.println("c) Obtener la cantidad de números impares");
            System.out.println("d) Obtener la suma de los numeros en diagonal");
            System.out.println("e) Obtener la cantidad de números multiplos de ");
            System.out.println("x) SALIR");
            System.out.print("Ingresa opcion pls: ");
            opcion = leer.next().charAt(0);

            switch (opcion) {
                case 'a':
                    sacarNumRepetido(arreglo);
                    break;

                case 'b':
                    sacarNumerosPares(arreglo);
                    break;

                case 'c':
                    sacarNumerosImPares(arreglo);
                    break;
                case 'd':
                    sacarSumaDiagonal(arreglo);
                    break;
                case 'e':
                    cantidadMultiplos5(arreglo);
                    break;
                case 'x':
                    System.out.println("saliendo del ejercicio 1...");
                    break;
                default:
                    System.out.println("opcion no valida.");
            }
        } while (opcion != 'x');
    }
     
     //generar un arreglo de int
     public int[][] generarArreglo(int filas, int columnas) {
        Scanner sc = new Scanner(System.in);
        int[][] arreglo = new int[filas][columnas];
        System.out.println("Ingrese los numeros para el arreglo:");
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Número [" + i + "][" + j + "]: ");
                arreglo[i][j] = sc.nextInt();
            }
        }
        return arreglo;
    }

     //Numeros que mas se repite
     public int sacarNumRepetido(int[][] arreglo) {
         int total =  arreglo.length * arreglo[0].length;
         int [] todos = new int[total];
         int index = 0;
         
       for (int i = 0; i < arreglo.length; i++) {
             for (int j = 0; j < arreglo[i].length; j++) {
                 todos[index++]= j;
             }
        }
       
       int repeticiones = 0;
       int repetido = todos[0];
       
         for (int i = 0; i < todos.length; i++) {
             int contador =0;
             for (int j = 0; j < todos.length; j++) {
                 if (todos[i] == todos [j]){
                     contador ++;
                 }
                 if (contador > repeticiones){
                     repeticiones = contador;
                     repetido = todos[i];
                 }
                 
             }
             
             
             
         }
         return repetido;
     }
     
     
     //Numeros pares
     public int sacarNumerosPares(int[][] arreglo) {
         int contador = 0;
         
         for (int i = 0; i < arreglo.length; i++) {
             for (int j = 0; j < arreglo[i].length; j++) {
                 if (arreglo[i][j] % 2 == 0) {
                contador++;
            }
        }
    }
    return contador;
     }
     
     //Numeros pares
     public int sacarNumerosImPares(int[][] arreglo) {
         int contador = 0;
         
         for (int i = 0; i < arreglo.length; i++) {
             for (int j = 0; j < arreglo[i].length; j++) {
                 if (arreglo[i][j] % 2 != 0) {
                contador++;
            }
        }
    }
    return contador;
     }

     //Suma diagonal
     public int sacarSumaDiagonal(int[][] arreglo) {
         int suma = 0;
         
         for (int i = 0; i < arreglo.length; i++) {
             suma+= arreglo [i][i];
         }
         return suma;
     }

    //metodo natii :p multiplos de 5
    public int cantidadMultiplos5(int[][] arreglo) {
    int contador = 0;
    for (int i = 0; i < arreglo.length; i++) {
        for (int j = 0; j < arreglo[i].length; j++) {
            if (arreglo[i][j] % 5 == 0) {
                contador++;
            }
        }
    }
    return contador;
}
    
}
