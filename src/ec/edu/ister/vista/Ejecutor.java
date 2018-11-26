/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.operacionesArreglos;

/**
 *
 * @author LAB2-PC
 */
public class Ejecutor {
    public static void main(String[] args) {
        operacionesArreglos ob=new operacionesArreglos();
        ob.llenarNotas();
        ob.imprimir();
        ob.llenarNota();
        ob.imprimir1();
        ob.dimencionar();
        ob.llenarNot();
        ob.imprimir2();
        ob.promedio();
        ob.numMaxMin();
    }
}
