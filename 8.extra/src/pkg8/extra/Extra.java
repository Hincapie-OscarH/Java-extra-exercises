/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
   detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
   y la cantidad de números impares. Al igual que en el ejercicio anterior los números
   negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package pkg8.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int a = 0;
        int c = 0;
        int par = 0;
        int impar = 0;
        do{
            System.out.println("Escriba ul número");
            n = sc.nextInt();
            if(n%5 == 0){
                a = 1;
                break;
            }
            if(n > 0 && n % 2 == 0){
                par++;
            }else{
                impar++;
            }
            c++;
        }while(a != 1);
        System.out.println("");
        System.out.println("La cantidad de números pares es: "+par);
        System.out.println("La cantidad de números impares es: "+impar);
        System.out.println("La cantidad de números introducidos es: "+c);
    }
    
}
