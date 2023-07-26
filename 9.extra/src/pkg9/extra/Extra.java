/*
9. Simular la división usando solamente restas. Dados dos números enteros mayores que
   uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
   Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
   este resultado es el residuo, y el número de restas realizadas es el cociente.
   Por ejemplo: 50 / 13:
   50 – 13 = 37 una resta realizada
   37 – 13 = 24 dos restas realizadas
   24 – 13 = 11 tres restas realizadas
   dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
   ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package pkg9.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el 1er número");
        int a = sc.nextInt();
        System.out.println("Ingrese el 2do número");
        int b = sc.nextInt();
        int cociente = 0;
        while(a>=b){
            a = a - b;
            cociente++;
        }
        System.out.println("El residuo es "+a+" y el cociente es "+cociente);
    }
    
}
