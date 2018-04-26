/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberfundamentos;

import java.util.Scanner;

/*
- La conversión de grados Celcius (C) a Fahrenheit (F) se realiza con la siguiente expresión matemática:
F = (9/5)*C+32
La conversión de Fahrenheit (F) a grados Celcius (C) se realiza con la siguiente expresión matemática:
F = (F-32)5/9
Generar la solución que permita obtener por parte de usuario el tipo de conversión que desea realizar y posterior presentación del resultado requerido.
(usar la instrucción que se crea conveniente)
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int tipo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que tipo de conversion desea realizar:\n1 = Celcius\n2 = Fahrenheit");
        tipo = entrada.nextInt();
        double c;
        double f;
        switch (tipo) {
            case 1:
                System.out.println("Ingresa grados centigrados");
                c = entrada.nextInt();
                f = (c * 9 / 5) + (32);
                System.out.printf("Grados centigrados:%.2f\nGrados fahrenheit: %.2f", c, f);
                break;
            case 2:
                System.out.println("Ingresa grados fahrenheit");
                f = entrada.nextInt();
                c = (f - 32) * 5 / 9;
                System.out.printf("Grados centigrados:%.2f\nGrados fahrenheit: %.2f", c, f);

        }
    }
}
