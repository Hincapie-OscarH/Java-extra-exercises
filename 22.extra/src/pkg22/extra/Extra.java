/*
22. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
    muestre la suma de sus elementos.
 */
package pkg22.extra;

import java.util.Scanner;
import java.util.Random;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite el tamaño de la matriz NxM");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matriz = new int [n][m];
        rellenar(matriz,n,m);
        mostrar(matriz,n,m);
        sumar(matriz,n,m);
    }
    
    private static void rellenar(int[][] matriz, int n, int m){
        Random rd = new Random();
        System.out.println("Rellenando la matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rd.nextInt(100) + 1;
            } 
        }
    }
    private static void mostrar(int[][] matriz, int n, int m){
        System.out.println("Imprimiendo la matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4s",matriz[i][j]+" ");
            } 
            System.out.println("");
        }
    }
    private static void sumar(int[][] matriz, int n, int m){
        System.out.println("Suma de la matriz");
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            } 
        }
        System.out.println("La suma es: "+suma);
    }
}
