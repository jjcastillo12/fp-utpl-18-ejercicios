/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double semanal = 0;
        String nombrehijo = "";
        int persona = 0;
        double pasajes;
        double bar;
        double salidas;
        double totalpasajes = 0;
        double totalbar = 0;
        double totalsalidas = 0;
        double totalfinal = 0;
        int contador;

        String reporte = "";
        reporte = reporte + String.format("%s\n%-15s%-15s%-15s%-15s\n", "Gastos Familia", "Personas", "Pasajes", "Bar", "Salidas");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el pago semana del padre de familia");
        semanal = entrada.nextDouble();
        System.out.println("Indique el numero de hijos de la familia");
        persona = entrada.nextInt();

        for (contador = 1; contador <= persona; contador++) {
            entrada.nextLine();
            System.out.printf("Ingrese el nombre del hijo: %d\n", contador);
            nombrehijo = entrada.nextLine();
            System.out.printf("Ingrese gasto de pasajes de %s:\n", nombrehijo);
            pasajes = entrada.nextDouble();
            System.out.printf("Ingrese los gastos de bar de %s:\n", nombrehijo);
            bar = entrada.nextDouble();
            System.out.printf("Ingrese los gastos de salidas de %s:\n", nombrehijo);
            salidas = entrada.nextDouble();
            reporte = reporte + String.format("%-15s%-15.2f%-15.2f%-15.2f\n", nombrehijo, pasajes, bar, salidas);
            totalpasajes = totalpasajes + pasajes;
            totalbar = totalbar + bar;
            totalsalidas = totalsalidas + salidas;
            totalfinal = totalpasajes + totalbar + totalsalidas;
        }

        System.out.printf(reporte);
        System.out.printf("Total Pasajes  %.2f\tTotal Bar  %.2f\tTotal Salidas  %.2f\nSueldo = %.2f\n", totalpasajes, totalbar, totalsalidas,semanal);
        
        if (semanal < totalfinal) {
            System.out.println("Al padre de familia le falta dinero");
        } else if (semanal > totalfinal) {
            System.out.println("Al padre de familia le sobra dinero");
        } else if (semanal == totalfinal) {
            System.out.println("Al padre de familia le alcanza con las justas el dinero");
        }
    }

}
