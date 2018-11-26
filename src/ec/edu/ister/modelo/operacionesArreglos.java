/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class operacionesArreglos {
    final int DIM=5;
    double suma;
    double promedio;
    int n=100;
    double notas[]=new double[DIM];
    float nota[]=new float[DIM];
    double not[];
    
    public void dimencionar(){
        int dim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número notas"));
        not=new double[dim];
    }
    
    public void llenarNot(){
        for (int i=0;i<not.length;i++) {
            not[i]=1+Math.random()*10;
        }
    }
    
    public void llenarNotas(){
        for (int i=0;i<notas.length;i++) {
            notas[i]=1+Math.random()*10;
        }
    }
    public void llenarNota(){
        for (int i=0;i<nota.length;i++) {
            nota[i]=(float) (Math.random() * n) + 1;
        }
    }
    
    public void imprimir(){
        for (int i=0;i<notas.length;i++) {
            System.out.println("- "+notas[i]);
        }
    }
    public void imprimir1(){
        for (int i=0;i<nota.length;i++) {
            System.out.println("- "+nota[i]);
        }
    } 
    public void imprimir2(){
        for (int i=0;i<not.length;i++) {
            System.out.println("- "+not[i]);
        }
    }
    public void promedio(){
        for (int i=0;i<nota.length;i++) {
            suma+=nota[i];
        }
        promedio=suma/nota.length;
        System.out.println("el promedio es: "+promedio);
    }
    
    public void numMaxMin(){
        double max=0,min=0;
        for(int i=0;i<not.length; i++){
            if(min>not[i]){
		min=not[i];
            }
            if(max<not[i]){
		max=not[i];
            }
	}
        System.out.println("El máximo es " + max + " y el minimo es " + min);
    }
}
