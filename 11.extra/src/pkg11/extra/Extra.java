/*
11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
    componen ese número. Por ejemplo, si introducimos el número 12345, el programa
    deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
    operador de división. Nota: recordar que las variables de tipo entero truncan los
    números o resultados.
 */
package pkg11.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca un número");
        int numero = sc.nextInt();
        System.out.println("El número "+numero+" tiene "+Integer.toString(numero).length()+" digitos");
    }
    
}
