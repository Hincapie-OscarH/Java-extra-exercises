/*
15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
    matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package pkg15.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite el número 1: ");
        int a = sc.nextInt();
        System.out.println("Digite el número 2: ");
        int b = sc.nextInt();
        int op = 0;
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese laopción deseada");
            op = sc.nextInt();
            
        }while(op < 0 || op > 5);
        if(op == 1){
            sumar(a,b);
        }else if(op == 2){
            restar(a,b);
        }else if(op == 3){
            multi(a,b);
        }else if(op == 4){
            div(a,b);
        }else
            System.out.println("Saliendo del sistema...");
    }
    
    private static void sumar(int a,int b){
        int suma = a + b;
        System.out.println("la suma de "+a+" y "+b+" es "+suma);
    }
    private static void restar(int a,int b){
        int resta = a - b;
        System.out.println("la resta de "+a+" y "+b+" es "+resta);
    }
    private static void multi(int a,int b){
        int multi = a * b;
        System.out.println("la multiplicación de "+a+" y "+b+" es "+multi);
    }
    private static void div(int a,int b){
        int div = a / b;
        System.out.println("la división de "+a+" y "+b+" es "+div);
    }
    
    
    
}
