/*
20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
    parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package pkg20.extra;

import java.util.Scanner;
import java.util.Random;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite el tamaño del arreglo");
        int n = sc.nextInt();
        int [] arr = new int [n];
        rellenar(arr,n);
        imprimir(arr,n);
    }
    
    private static void rellenar(int[] arr, int n){
        Random rd = new Random();
        System.out.println("Rellenando el arreglo");
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(10) + 1;
        }
    }
    private static void imprimir(int[] arr, int n){
        System.out.print("El arreglo es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
