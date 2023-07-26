/*
18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
    N, con los valores ingresados por el usuario.
 */
package pkg18.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite el tamaño del arreglo");
        int n = sc.nextInt();
        int[] vector = new int [n];
        int a = 1;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el número "+a);
            vector[i] = sc.nextInt();
            a++;
            suma += vector[i];
        }
        
        System.out.println("La suma es "+suma);
    }  
}