/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe03;

/**
 *
 * @author Gabriel
 */
public class Exe03 {

    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12};
        
       for (int i = 0; i < 8; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[i + 8];
            vetor[i + 8] = temp;
        }
       
        System.out.println("Vetor após a troca:");
        for (int i = 0; i < 16; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    
}
