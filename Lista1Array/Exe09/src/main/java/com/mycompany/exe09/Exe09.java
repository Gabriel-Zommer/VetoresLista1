/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe09;

/**
 *
 * @author Gabriel
 */
public class Exe09 {
    public static void main(String[] args) {
        // Seu vetor de algarismos
        int[] algarismos = {1, 2, 3, 4, 5};

        // Converte o vetor de algarismos para número
        int numero = converterParaNumero(algarismos);

        // Escreve o número por extenso
        String numeroPorExtenso = converterParaExtenso(numero);

        // Imprime o resultado
        System.out.println("O número por extenso é: " + numeroPorExtenso);
    }

    // Função para converter um vetor de algarismos para número
    public static int converterParaNumero(int[] algarismos) {
        int numero = 0;
        for (int i = 0; i < algarismos.length; i++) {
            numero = numero * 10 + algarismos[i];
        }
        return numero;
    }

    // Função para converter um número para extenso (implementação básica)
    public static String converterParaExtenso(int numero) {
        // Implementação básica para converter números até 99
        String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] especiais = {"", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

        if (numero >= 1 && numero <= 9) {
            return unidades[numero];
        } else if (numero >= 11 && numero <= 19) {
            return especiais[numero - 10];
        } else if (numero % 10 == 0) {
            return dezenas[numero / 10];
        } else {
            return dezenas[numero / 10] + " e " + unidades[numero % 10];
        }
    }
}
