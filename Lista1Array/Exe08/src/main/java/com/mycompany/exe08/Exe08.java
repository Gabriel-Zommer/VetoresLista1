/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe08;

/**
 *
 * @author Gabriel
 */
public class Exe08 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       
        
        for (int i = 0; i < 9; i++) {
            vetor[i + 1] += vetor[i];
        }
        System.out.println("Vetor após acumular os valores:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        
    }
}
