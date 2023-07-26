/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
   usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package pkg1.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escriba una cantudad de minutos");
        int minutos = sc.nextInt();
        calculo(minutos);
    }
    
    private static void calculo(int minutos){
        int dia = minutos / 1440;
        minutos %= 1440;
        int hora = minutos / 60;
        minutos %= 60;
        
        System.out.println("Dias: "+dia);
        System.out.println("Horas: "+hora);
        System.out.println("Minutos: "+minutos);
    }
    
}
