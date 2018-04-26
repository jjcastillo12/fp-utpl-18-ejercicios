/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberfundamentos;

import java.util.Scanner;

/*
Realizar un algoritmo y posterior codificación en lenguaje Java, para los  siguientes ejercicios:
- Una solución que permia leer el número de día (un valor entre 1 y 7) e imprima Lunes si es 1, 
Martes si es 2, ... , Domingo si es 7.
(usar instrucción switch)
 */
public class DeberFundamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        String lunes = "Lunes";
        String martes = "Martes";
        String miercoles = "Miercoles";
        String jueves = "Jueves";
        String viernes = "Viernes";
        String sabado = "Sabado";
        String domingo = "Domingo";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número del 1 al 7");
        dia = entrada.nextInt();
        switch (dia) {
            case 1:
                System.out.printf("El dia seleccionado es: %s\n", lunes);
                break;
            case 2:
                System.out.printf("El dia seleccionado es: %s\n", martes);
                break;
            case 3:
                System.out.printf("El dia seleccionado es: %s\n", miercoles);
                break;
            case 4:
                System.out.printf("El dia seleccionado es: %s\n", jueves);
                break;
            case 5:
                System.out.printf("El dia seleccionado es: %s\n", viernes);
                break;
            case 6:
                System.out.printf("El dia seleccionado es: %s\n", sabado);
                break;
            case 7:
                System.out.printf("El dia seleccionado es: %s\n", domingo);
                break;
            default:
                System.out.println("El número escrito es incorrecto, ingrese un numero válido del 1 al 7");

        }

    }

}
