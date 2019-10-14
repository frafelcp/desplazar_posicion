/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despPosicion;

import java.util.Scanner;

//Leer 10 numeros enteros
//almacenarlos en un vector
//desplazar un posicion a hacia abajo: el 1 pasa al 2, el 2 pasa al 3, etc
//el ultimo pasa a ser el primero

/**
 *
 * @author Felix Castro
 */
public class despPosicion {
    public static void main(String[] args) {
        //leer por teclado y consola
        Scanner entrada = new Scanner(System.in);
        
        //definimos variables y vectores
        int [] numeros;
        int elem;
        int ultimo;
        
        System.out.println("DESPLAZAR UNA POSICION");
        System.out.println("-----------------------------------------");
        
        //ingresamos cuantos numeros vamos a guardar
        System.out.println("Digite cuantos numeros va guardar");
        elem = entrada.nextInt();
        
        //tamaño del vector
        numeros = new int[elem];
        
        System.out.println("-----------------------------------------");
        
        //llenamos el vector
        System.out.println("Registro de numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i+1)+".Digite un numero");
            numeros[i] = entrada.nextInt();
        }
        
        //guardamos el ultimo elemento
        ultimo = numeros[9];
        
        //desplazar posicion
        for (int i = 8; i >= 0; i--) {
            numeros[i+1] = numeros[i];
        }
        
        //ultimo elemeto como primero
        numeros[0] = ultimo;
        
        System.out.println("-----------------------------------------");
        
        //imprimimos
        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i+1)+".Numero: "+numeros[i]);
        }
    }
}
