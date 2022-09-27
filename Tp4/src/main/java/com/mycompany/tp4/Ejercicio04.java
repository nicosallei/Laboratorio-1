/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú con estas opciones:
a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
c) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
d) Sumar la diagonal principal
e) Sumar la diagonal inversa
f) La media de todos los valores de la matriz

IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se deberán de ejecutar, simplemente 
mostrar un mensaje que diga que debes rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de 
cada una de las opciones del menú.

 */
package com.mycompany.tp4;

import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class Ejercicio04 {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
       int x; 
        
        while(true){
        System.out.println("Escriba el tamaño de la matriz cuadrada (valor minimo 4, valor maximo 10)");
        x =sc.nextInt();
        if(x>3 && x<11){
        break;
        }else System.out.println("El tamaño ingresado es incorrecto \n");
        }
        
        int arreglo [][]= matriz(x);
        
        
        
    }
    public static int [][] matriz (int x){
    int resultado[][] = new int[x][x];
            Scanner sc = new Scanner (System.in);
    for(int i=0;i<x;i++){
    for (int j=0;j<x;j++){
    resultado[i][j] = sc.nextInt();
    
    }
    }
    
    return resultado;
    }
    public static int sumaFila(int arreglo[][]){
    Scanner sc = new Scanner (System.in);
    int x=0;
     int resultado=0;
        while(true){
            System.out.println("Ingrese la fila de la matriz que quiere sumar (minimo "+arreglo.length+", maximo "+arreglo.length+")");
            x = sc.nextInt();
           
            
        if( arreglo.equals(x)){
        break;
        }else System.out.println("La fila ingresada no existe");
        }
        
        for(int j=0;j<arreglo[0].length;j++){
        resultado +=  arreglo[x][j];
        }
    return resultado;
    }
    public static int sumaColumna(int arreglo[][]){
    Scanner sc = new Scanner (System.in);
    int x=0;
     int resultado=0;
        while(true){
            System.out.println("Ingrese la columna de la matriz que quiere sumar (minimo 0, maximo "+arreglo[0].length+")");
            x = sc.nextInt();
           
            
        if( arreglo.equals(x)){
        break;
        }else System.out.println("La columna ingresada no existe");
        }
        
        for(int i=0;i<arreglo.length;i++){
        resultado +=  arreglo[i][x];
        }
    return resultado;
}
