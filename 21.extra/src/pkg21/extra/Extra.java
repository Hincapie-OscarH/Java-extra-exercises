/*
21. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
    desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
    trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
    programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
    desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
    igual al 7 de sus notas del curso.
 */
package pkg21.extra;

import java.util.Scanner;
public class Extra {
    public static final int ALUMNOS = 10;
    public static final int NOTAS = 4;
    public static final double TP_1 = 0.10;
    public static final double TP_2 = 0.15;
    public static final double INT_1 = 0.25;
    public static final double INT_2 = 0.50;
    public static final int MIN_APROBADO = 7;
    public static void main(String[] args) {
        double[][] notasAlumnos = new double[ALUMNOS][NOTAS];
        double[] promedios = new double[ALUMNOS];
        
        cargarNotas(notasAlumnos);
        calcularPromedios(notasAlumnos, promedios);
        mostrarPromedios(promedios);
    }
    
    public static void cargarNotas(double[][] notasAlumnos) {
        Scanner leer = new Scanner(System.in);
        
        double nota;
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("- Para el alumno número " + (i + 1) + " -");
            for (int j = 0; j < NOTAS; j++) {
                try {
                    do {
                        System.out.println("Ingrese la nota número " + (j + 1) + ": ");
                        nota = Double.valueOf(leer.nextLine());
                    } while (nota <= 0 || nota > 10);
                    notasAlumnos[i][j] = nota;
                } catch (Exception exc) {
                    System.out.println("¡La nota ingresada no es válida!");
                    leer.nextLine();
                }
            }
        }
    }
    
    public static void calcularPromedios(double[][] notasAlumnos, double[] promedios) {
        for (int k = 0; k < ALUMNOS; k++) {
            promedios[k] = notasAlumnos[k][0] * TP_1 + notasAlumnos[k][1] * TP_2 + notasAlumnos[k][2] * INT_1 + notasAlumnos[k][3] * INT_2; 
        }
    }
    
    public static void mostrarPromedios(double[] promedios) {
        int aprobados = 0;
        int desaprobados = 0;
        
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("Para el alumno número " + (i + 1) + " el promedio es " + promedios[i]);
            if (promedios[i] >= MIN_APROBADO) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        System.out.println();
        System.out.println("La cantidad de aprobados es de " + aprobados + " alumnos");
        System.out.println("La cantidad de desaprobados es de " + desaprobados + " alumnos");
    }   
}