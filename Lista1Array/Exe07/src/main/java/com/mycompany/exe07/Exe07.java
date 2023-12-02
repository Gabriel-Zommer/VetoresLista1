/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe07;

/**
 *
 * @author Gabriel
 */
public class Exe07 {

    public static void main(String[] args) {
         int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
         
         int[] vetorB = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
         
         int[] vetorC = new int[40];
         
         for (int i = 0; i < 20; i++){
             vetorC[2 * i] = vetorA[i];
             vetorC[2 * i + 1] = vetorB[i];
         }
         
         System.out.println("Vetor C após transferir conteúdos:");
         for (int i = 0; i < 40; i++){
             System.out.print(vetorC[i] + " ");
         }
    }
}
