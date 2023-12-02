/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe05;

/**
 *
 * @author Gabriel
 */
public class Exe05 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int par = 0;
        
        for(int i = 0; i < vetor.length; i++){
            int resto = vetor[i] % 2;
            if(resto == 0){
               par += 1; 
            }
        }
        System.out.println("a quantidade de vetores pares é: " + par);
    }
}
