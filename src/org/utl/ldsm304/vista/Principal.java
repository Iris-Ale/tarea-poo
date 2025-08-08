/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm304.vista;

import java.util.Scanner;
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
                    Controlador c = new Controlador();
                    c.ejecutar(); 
                    break;
                case '2':
                    ControladorCadena cc = new ControladorCadena();
                    cc.ejecutar(); 
                    break;
                case 'x':
                    System.out.println("saliendo...");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (opcion != 'x');
    }
    }
    

