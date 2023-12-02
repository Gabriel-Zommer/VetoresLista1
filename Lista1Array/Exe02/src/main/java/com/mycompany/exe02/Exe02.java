/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe02;

/**
 *
 * @author Gabriel
 */
public class Exe02 {

    public static void main(String[] args) {
        int[] meuArray = new int[10];
        
        for (int i = 0, valor = 1; i < 10; i++, valor += 2) {
            meuArray[i] = valor;
        }
        
        System.out.println("Vetor de Números Ímpares:");
        for (int i = 0; i < 10; i++) {
            System.out.println(meuArray[i]);
        }
    }
}
