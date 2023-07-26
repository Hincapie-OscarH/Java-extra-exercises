/*
19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
    comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
    elementos).
 */
package pkg19.extra;

import java.util.Arrays;
import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //int arr1[] = {1, 2, 3}; 
        //int arr2[] = {1, 2, 8}; 
        System.out.println("Digite el tamaño de los arreglos");
        int n = sc.nextInt();
        int [] arr1 = new int [n];
        int [] arr2 = new int [n];
        System.out.println("Arreglo 1");
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el valor de la posición "+i);
            arr1[i] = sc.nextInt();
        }
        System.out.println("Arreglo 2");
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el valor de la posición "+i);
            arr2[i] = sc.nextInt();
        }
        if (Arrays.equals(arr1, arr2)) 
            System.out.println("LOS ARREGLOS SON IGUALES"); 
        else
            System.out.println("LOS ARREGLOS NO SON IGUALES"); 
    }
    
}
