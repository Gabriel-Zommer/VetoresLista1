/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe04;

/**
 *
 * @author Gabriel
 */
public class Exe04 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        
        int x = vetor[0];
        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                posicao = i;
                break;
            }
        }

        System.out.println("A posição do primeiro elemento no vetor é: " + posicao);
        System.out.println("o valor do vetor é: " + x);
    }
}

 
