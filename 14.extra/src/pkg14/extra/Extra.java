/*
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
    cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package pkg14.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite la cantidad de familias");
        int n = sc.nextInt();
        int a = 1;
        int m = 0;
        int b = 1;
        int c = 0;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite la cantidad de hijos de la familia "+a);
            m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.println("Digite la edad del hijo "+b);
                c = sc.nextInt();
                suma += c; 
                b++;
            }
            
            System.out.println("");
            System.out.println("La media de edad de la familia "+a+" es:"+(suma/m));
            suma = 0;
            b = 1;
            a++;
            System.out.println("");
        } 
    }
}