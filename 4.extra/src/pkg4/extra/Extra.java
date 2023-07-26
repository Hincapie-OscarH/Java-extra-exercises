/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
   equivalente en romano.
 */
package pkg4.extra;

import java.util.Scanner;
public class Extra {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do {
             System.out.print("Introduce un número entre 1 y 10: ");
             n = sc.nextInt();
      } while (n < 0 || n > 11);
      System.out.println(n + " en número romano es: " + convertirANumerosRomanos(n));                            
  }

    private static String convertirANumerosRomanos(int n){
        String romano = "";
        switch(n) {
            case 1: romano = "I";
                break;
           case 2: romano = "II";
                break;
           case 3: romano = "III";
                break;
           case 4: romano = "IV";
                break;
           case 5: romano = "V";
                break;
           case 6: romano = "VI";
                break;
           case 7: romano = "VII";
                break;
           case 8: romano = "VIII";
                break;
           case 9: romano = "IX";
                break;
           case 10: romano = "X";
                break;
            default:
                break;
        }
        return romano;
    }
    
}
