/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe06;

/**
 *
 * @author Gabriel
 */
public class Exe06 {

    public static void main(String[] args) {
        int[] vetor = {5, -2, 8, -3, 0, 12, -7, 15, 20, -1, 6, -10, 4, -8, 11, 19, -5, 9, 17, 22,
                       -6, 14, 3, -9, 7, -4, 10, -15, 25, -18, 30, 35, -22, 16, 21, -11, 13, -14,
                       18, -20, 26, -30};
        
        for (int i = 0; i < 40; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }
        
        System.out.println("Vetor após atribuir 0 para negativos:");
        for (int i = 0; i < 40; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

