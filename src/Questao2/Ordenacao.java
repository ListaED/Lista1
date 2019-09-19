/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

/**
 *
 * @author ht3000796
 */
public class Ordenacao {
    
    //<editor-fold desc="Bubble Sort">
    public static void ordemCrescenteBubbleSort(Numeros numeros[], int n) {
        int i;
        int j;
        Numeros aux;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (numeros[j].getNumero()> numeros[j + 1].getNumero()) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }
    //</editor-fold>
    
}
