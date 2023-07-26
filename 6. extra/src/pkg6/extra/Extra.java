/*
6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
   por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package pkg6.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escriba la cantidad de personas a ingresar");
        int n = sc.nextInt();
        int pb = 0;
        int p = 0;
        int a = 1;
        int [] vector = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura "+a);
            vector[i] = sc.nextInt();
            a++;
        }
        
        for (int i = 0; i < n; i++) {
            p += vector[i];
            if(vector[i]<160){
                pb += vector[i];
            }
        }
        
        System.out.println("EL promedio de altura es: "+(p/2)+"cm");
        System.out.println("EL promedio de altura por debajo de 1.60 es: "+(pb/2)+"cm");
    }
    
}
