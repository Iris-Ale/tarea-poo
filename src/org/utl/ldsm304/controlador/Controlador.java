/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.controlador;

/**
 *
 * @author IRIS
 */
public class Controlador {

    //aki metodo ejecutar con menu



    //metodo natii :p
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
