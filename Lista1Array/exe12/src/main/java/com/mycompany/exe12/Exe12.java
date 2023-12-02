/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe12;

import java.util.Arrays;

/**
 *
 * @author Gabriel
 */
public class Exe12 {

    public static void main(String[] args) {
        int[] vetor = {1, 0, 3, 0, 5, 0, 0, 8, 9, 0, 11, 0, 13, 0, 0, 0, 17, 0, 19, 20, 0,
                22, 0, 0, 25, 26, 27, 28, 29, 0, 0, 32, 0, 34, 0, 36, 0, 38, 39, 0, 41, 0,
                43, 0, 45, 0, 0, 0, 49, 50};
        
        compactarVetor(vetor);
        
        System.out.println(Arrays.toString(vetor));
    }
    
    public static void compactarVetor(int[] vetor){
        int j = 0;
        
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] != 0){
                vetor[j++] = vetor[i];
            }
            
            while (j < vetor.length){
                vetor[j++] = 0;
            }
        }
    }
}
