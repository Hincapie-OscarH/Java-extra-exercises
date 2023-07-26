/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
   Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package pkg3.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese una letra");
        String letra = sc.nextLine();
        letra = letra.toLowerCase();
        if(letra.equals("a") || letra.equals("b") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("Es una vocal");
        }else {
            System.out.println("No es una vocal");
        }
    }
    
}
