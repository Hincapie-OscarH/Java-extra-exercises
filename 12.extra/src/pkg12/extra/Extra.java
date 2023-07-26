/*
12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
    0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.
 */
package pkg12.extra;


public class Extra {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                        String a = String.valueOf(i);
                        String b = String.valueOf(j);
                        String c = String.valueOf(k);
                    
                    if(c.equals("3") && b.equals("3") && a.equals("3")){
                        a = "E";
                        b = "E";
                        c = "E";
                        System.out.println(a+"-"+b+"-"+c);
                    }else if(c.equals("3") && b.equals("3")){
                        c = "E";
                        b = "E";
                        System.out.println(a+"-"+b+"-"+c);
                    }else if(c.equals("3") && a.equals("3")){
                        a = "E";
                        c = "E";
                        System.out.println(a+"-"+b+"-"+c);
                    }else if(b.equals("3") && a.equals("3")){
                        b = "E";
                        a = "E";
                        System.out.println(a+"-"+b+"-"+c);
                    }else if(c.equals("3")){
                        c = "E";
                        System.out.println(a+"-"+b+"-"+c);
                    }else if(b.equals("3")){
                        b = "E";
                        System.out.println(a+"-"+b+"-"+c);
                    }else if(a.equals("3")){
                        a = "E";
                        System.out.println(a+"-"+b+"-"+c);
                    }else{
                        System.out.println(a+"-"+b+"-"+c);
                    } 
                }
            }
        }
    } 
}
