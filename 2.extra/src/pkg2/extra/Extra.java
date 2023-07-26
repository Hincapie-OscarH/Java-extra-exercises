/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
   una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
   C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
   iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package pkg2.extra;


public class Extra {


    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        imp1(a,b,c,d);
        imp2(a,b,c,d);
        
    }
    
    private static void imp1(int a, int b, int c, int d){
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
        System.out.println("El valor de c es: "+c);
        System.out.println("El valor de d es: "+d);
    }
    
    private static void imp2(int a, int b, int c, int d){
        int e = 0;
        e = b;
        b = c;
        c = a;
        a = d;
        d = e;
        
        System.out.println("Los nuevos valores son");
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
        System.out.println("El valor de c es: "+c);
        System.out.println("El valor de d es: "+d);
        
    }
    
}
