/*
5. Una obra social tiene tres clases de socios:
   o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
   todos los tipos de tratamientos.
   o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
   para los mismos tratamientos que los socios del tipo A.
   o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
   tratamientos.
   o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
   real que represente el costo del tratamiento (previo al descuento) y determine el
   importe en efectivo a pagar por dicho socio.
 */
package pkg5.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String letra;
        do{
            System.out.println("Clase de socios");
            System.out.println("Digite la opción de socio a elegir entre A, b o C");
            letra = sc.nextLine();
            letra = letra.toUpperCase();
        }while(!letra.equals("A") && !letra.equals("B") && !letra.equals("C")); 
        System.out.println("Digite el costo del tratamiento");
        double costo = sc.nextInt();

        System.out.println("");
        System.out.println("El valor a pagar es: "+total(letra,costo));
    }
    
    private static double total(String letra, double costo){
        double total = 0;
        if(letra.equals("A")){
            total = (costo * 0.5);
        }else if(letra.equals("B")){
            total = (costo * 0.35);
        }else{
            total = costo;
        }
        return total;
    } 
}