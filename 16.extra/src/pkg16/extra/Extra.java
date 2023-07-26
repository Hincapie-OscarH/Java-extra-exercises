/*
16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
    las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package pkg16.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        info();
    }
    private static void info(){
        System.out.println("Indique la cantidad de personas");
        int n = sc.nextInt();
        String nombre [] = new String [n]; 
        int edad [] = new int [n];
        int a = 1;
        int i = 0;
        String palabra = "";
            
        for (i = 0; i < n; i++) {
            System.out.println("Indique el nombre de la persona "+a);
            nombre[i] = sc.next();
            System.out.println("Indique la edad de la persona "+a);
            edad[i] = sc.nextInt();
            a++;
        }
            
        System.out.println("Mostrando información");
        
        do {
            for (i = 0; i< n; i++) {
                if(edad[i] >= 18){
                    System.out.println(nombre[i]+" es mayor de edad");
                }else if(edad[i] < 18){
                    System.out.println(nombre[i]+" no es mayor de edad");
                }  
                System.out.println("¿Desea continuar? S/N");
                palabra = sc.next();
                palabra = palabra.toUpperCase();
                if(palabra.equals("N")){
                    break;
                }
           }        
        }while(!palabra.equals("N"));   
    }
    
}
