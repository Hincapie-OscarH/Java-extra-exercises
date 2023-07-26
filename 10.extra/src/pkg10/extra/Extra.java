/*
10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
 */
package pkg10.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {  
        boolean band = false;
        int n1 = (int) (Math.random()*(10-0)+0);
            int n2 = (int) (Math.random()*(10-0)+0);
            int n3 = n1*n2;
            System.out.println(n3);
        do{   
            System.out.println("Escriba el número a adivinar");
            int n4 = sc.nextInt();
            if(n4 != n3){
                System.out.println("Respuesta incorrecta, vuelva a intentarlo");
            }else{
                band = true;
            }
        }while(band == false);
        System.out.println("Respuesta correcta");
    }
    
}
