/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe11;

/**
 *
 * @author Gabriel
 */
public class Exe11 {

    public static void main(String[] args) {
        int[] vetor = {1,2,2,4,5,6,7,8,9,10};
        if (temNumerosRepetidos(vetor)) {
            
            System.out.println("O array contém números repetidos.");
        } else {
            System.out.println("O array não contém números repetidos.");
        }
        
    }
    
    public static boolean temNumerosRepetidos(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                  
                    return true; 
                }
            }
        }
        return false; 
    }
}
