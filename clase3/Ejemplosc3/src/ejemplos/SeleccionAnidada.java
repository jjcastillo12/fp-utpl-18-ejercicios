/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        String estudiante;
        System.out.println("Ingrese sus nombres:");
        estudiante = entrada.nextLine();
        System.out.println("Ingrese su calificación");
        calificacion = entrada.nextInt();
        if (calificacion >= 90 && calificacion <=100 ) {
            System.out.printf("Estudiante:%s\nexcelente\ncon calificación\t\n%d\n",estudiante, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("Estudiante:%s\nMuy buena\ncon calificación\t\n%d\n", estudiante,calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("Estudiante:%s\nRegular\ncon calificación\n\t%d\n", estudiante,calificacion);

                } else {
                    System.out.printf("Estudiante:%s\nReprobado\ncon calificación\n\t%d\n", estudiante, calificacion);
                }
            }
        }
        
    }
}
