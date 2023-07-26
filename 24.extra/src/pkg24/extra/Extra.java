/*
24. Realizar un programa que complete un vector con los N primeros números de la sucesión
    de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
    números:
    1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
    La sucesión del número 2 se calcula sumando (1+1)
    Análogamente, la sucesión del número 3 es (1+2),
    Y la del 5 es (2+3),
    Y así sucesivamente...
    La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
    Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
    Fibonaccin = 1 para todo n<=1
    Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
    como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
    Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
    https://quantdare.com/numeros-de-fibonacci/
 */
package pkg24.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;

        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        int [] f = fibonacci(numero);
        System.out.println("Fibonacci: ");
        for(int valor : f){
            System.out.print(" "+valor);
        }
        System.out.println("");
    }
    
    private static int [] fibonacci(int n){
        int [] r = new int [n];
        r[0] = 1;
        r[1] = 1;
        for (int i = 2; i < n; i++) {
            r[i] = r[i-1] + r[i-2];
        }
        return r;
    }
}
    

