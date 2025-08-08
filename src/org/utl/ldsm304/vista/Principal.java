/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm304.vista;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.utl.ldsm304.controlador.Controlador;
import org.utl.ldsm304.controlador.ControladorCadena;

/**
 *
 * @author IRIS Y NAT
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        

        do {
            System.out.println("\n MENU PRINCIPAL :) ");
            System.out.println("1) Ejercicio 1");
            System.out.println("2) Ejercicio 2");
            System.out.println("x) Salir");
            System.out.print("Opción: ");
            opcion = leer.next().charAt(0);

            switch (opcion) {
                case '1':
                {
                    try {
                        ejecutarEjericio1();
                    } catch (Exception e) {
                         System.out.println(e.getMessage());
                    }
                }
                    break;

                case '2':
                {
                    try {
                        ejecutar();
                    } catch (Exception ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                case 'x':
                    System.out.println("saliendo...");
                    break;
                    
                default:
                    System.out.println("opcion no valida");
            }
        } while (opcion != 'x');
    }
    
     public static void ejecutarEjericio1() throws Exception {
        Scanner leer = new Scanner(System.in);
        Controlador c = new Controlador();
        
        //generar arreglo
        int arreglo [][]= c.generarArreglo(3, 3);
        
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
                    System.out.println(c.sacarNumRepetido(arreglo));
                    break;

                case 'b':
                    System.out.println(c.sacarNumerosPares(arreglo));
                    break;

                case 'c':
                    System.out.println(c.sacarNumerosImPares(arreglo));
                    break;
                case 'd':
                    System.out.println(c.sacarSumaDiagonal(arreglo));
                    break;
                case 'e':
                    System.out.println(c.cantidadMultiplos5(arreglo));
                    break;
                case 'x':
                    System.out.println("saliendo del ejercicio 1...");
                    break;
                default:
                    throw new Exception("Ingresa una opcion valida");
            }
        } while (opcion != 'x');
    }
     
     public static void ejecutar() throws Exception {
        Scanner leer = new Scanner(System.in);
        ControladorCadena cc = new ControladorCadena();
        
        String[][] arreglo = cc.generarArreglo(3, 3);

        char opcion;
        do {
            System.out.println("\n MENU EJERCICIO 2 ---");
            System.out.println("a) Mostrar cadenas que comienzan con o");
            System.out.println("b) mostrar cadena (las vocales) ");
            System.out.println("c) Mostrar cadenas que contienen 'sa'");
            System.out.println("x) SALIRr");
            System.out.print("Ingresa opcion pls: ");
            opcion = leer.next().charAt(0);

            switch (opcion) {
                case 'a':
                    cc.mostrarCadenasConO(arreglo);
                    break;

                case 'b':
                    cc.mostrarCadenaVocales(arreglo);
                    break;

                case 'c':
                    cc.mostrarCadenasConSa(arreglo);
                    break;

                case 'x':
                    System.out.println("saliendo del ejercicio 2...");
                    break;

                default:
                    throw new Exception("Ingresa una opcion valida");
            }
        } while (opcion != 'x');
    }
    }
    

