/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
   promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
   números serán introducidos por el usuario. Realice dos versiones del programa, una
   usando el bucle “while” y otra con el bucle “do - while”.
 */
package pkg7.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int a = 1;
        int b = 0;
        int max = 0;
        int min = 999999999;
        boolean band = true;
        double suma = 0;
        do{
            System.out.println("Escriba el número "+a);
            n = sc.nextInt();
            suma += n;
            if(band == true){
                max = n;
                min = n;
                band = false;
            }else {
                if(n > max){
                    max = n;
                }else{
                    if(n < min && n == 0){
                        min = min;
                    }else {
                        if(n < min){
                        min = n;
                        }
                    }
                }
            }    
            b++;
            a++;
        }while(n != 0);
        System.out.println("El número máximo es: "+max);
        System.out.println("El número mínimo es: "+min);
        System.out.println("El promedio es: "+suma/b);
    }
}    
