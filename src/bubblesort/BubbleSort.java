/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author CHRLS
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vect[] = {1, 2, 3, 5, 4};
        int i = 0;
        int auxiliar;

        System.out.println("UNSORTED: ");
        for (i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("---------------------------------------------------");
        for (i = 0; i < vect.length; i++) {
            for (int j = 0; j < (vect.length - 1); j++) {
                if (vect[j] > vect[j + 1]) {
                    auxiliar = vect[j];
                    vect[j] = vect[j + 1];
                    vect[j + 1] = auxiliar;
                }
            }
            System.out.println(vect[i]);
        }
    }
}
