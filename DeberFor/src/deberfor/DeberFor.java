/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberfor;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DeberFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String persona = "";
        String nombre = "";
        String apellido = "";
        int num_asignaturas = 0;
        int edad = 0;
        double bim_1 = 0;
        double bim_2 = 0;
        double promedio = 0;
        double total_promedio = 0;
        double suma = 0;
        double auxuliar = 0;
        boolean bandera = true;
        String cadena = "";
        Scanner entrada = new Scanner(System.in);

        while (bandera) {

            System.out.println("Ingrese los Nombre completo del estudiante 1: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese los Apellidos completos del estudiante: ");
            apellido = entrada.nextLine();
            System.out.println("Ingrese Edad del estudiante: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese el numero de asignaturas del estudiante: ");
            num_asignaturas = entrada.nextInt();
            cadena = String.format("Nombre de estudiante 1:\t", nombre, "\t" + apellido, "\n", "Edad: \t", edad, "\n", "Número de Asignaturas: \t", num_asignaturas, "\n\n");
            cadena = String.format("Reporte de Notas\n", "Persona\t\t\t\tBim-1\t\t\tBim-2\t\t\tPromedio\n");

            for (int contador = 1; contador <= num_asignaturas; contador++) {

                System.out.println("Ingrese el nombre de la asignatura");
                persona = entrada.next();
                System.out.println("Ingrese las nota del Bim-1: ");
                bim_1 = entrada.nextDouble();
                System.out.println("Ingrese las notas del Bim-2: ");
                bim_2 = entrada.nextDouble();
                entrada.nextLine();
                suma = bim_1 + bim_2;
                promedio = suma / 2;
                auxuliar = auxuliar + promedio;

                cadena = String.format(
                        "%s\t\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\t\n",
                        persona, bim_1, bim_2, promedio);

            }
            total_promedio = auxuliar / num_asignaturas;
            cadena = String.format(
                    "\t\t\t\t\t\tPromedio \t\t%.2f\t\n",
                    total_promedio);

            if (promedio >= 19) {
                cadena = String.format("\n\n\t", apellido, "\t", nombre, "\ttiene un promedio de Sobresaliente\n\n\n");
            } else if (promedio >= 16 && promedio < 19) {
                cadena = String.format("\n\n", apellido, "\t", nombre, "\ttiene un promedio de Muy Bueno\n\n\n");

            } else if (promedio >= 13 && promedio < 16) {

                cadena = String.format("\n\n", apellido, "\t", nombre, "\ttiene un promedio de Bueno\n\n\n");
            } else if (promedio < 13) {
                cadena = String.format("\n\n", apellido, "\t", nombre, "\ttiene un promedio de Regular\n\n\n");

                entrada.nextLine();

            }
            System.out.println("¿Desea añadir otro reporte de estudiante?");
            String temporal = entrada.nextLine();
            if (temporal.equals("no")) {
                bandera = false;
            }
        }

        System.out.printf("Reporte calificaciones de estudiantes\n", "%s", cadena);

    }
}
