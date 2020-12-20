/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double sumaTotal = 0;
        double mediaAritmetica;
        int valorArreglo;

        for (int i = 0; i < arreglo.length; i++) {
            sumaTotal = sumaTotal + arreglo[i];
            // mediaAritmetica = (double)sumaTotal/arreglo.length;
        }
        mediaAritmetica = (double) sumaTotal / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            valorArreglo = arreglo[i];
            if (valorArreglo > mediaAritmetica) {
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                if (valorArreglo < mediaAritmetica) {
                    elementosAbajoMedia = elementosAbajoMedia + 1; 
                }
            }

        }
        System.out.printf("La media aritmética es: %.4f\nValores Arriba de "
                + "la media son: %d\nValores Abajo de la media son: %d\n",
                mediaAritmetica, elementosArribaMedia, elementosAbajoMedia);

    }

}
