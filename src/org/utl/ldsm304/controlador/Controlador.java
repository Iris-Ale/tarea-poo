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
                 todos[index++]= arreglo [i][j];
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
                 
             }
             
             if (contador > repeticiones){
                     repeticiones = contador;
                     repetido = todos[i];
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
