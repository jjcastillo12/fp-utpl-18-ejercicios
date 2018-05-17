/*
 Se necesita generar una solución que permita ingresa los datos de varios autos importados, 
el número de autos a ingresar se debe solicitar al usuario de manera previa.
Por cada automóvil, se tiene que ingresar: marca, origen y costo. 
Información para los cálculos:
- Se genera un impuesto en función del país de origen, en función del costo del automóvil:
	- Si es Argentina el impuesto es del 20%
	- Si es Colombia el impuesto es del 25%
	- Si es Chile el impuesto es del 30%
	- Cualquier otro país, el impuesto es de 40%
- El precio de venta es igual a la suma del costo del automóvil más el impuesto
- Se debe imprimir el total de autos importados.
- Se debe imprimir  el total de impuestos generados.
- Se debe imprimit el total de los precios de venta de los autos.
- Se debe generar e imprimir el total de autos de los países de origen:
 */
package deberwhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2while {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numauto = 0;
        String marca = "";
        String origen = "";
        double costo;
        int contador = 1;
        double impuesto = 0;
        double precioventa = 0;
        int argentina = 0;
        int colombia = 0;
        int chile = 0;
        int restopaises = 0;
        double impuestototal = 0;
        double ventatotal = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        String reporte = "";
        reporte = reporte + String.format("%s\n%-16s%-16s%-16s%-16s%-16s\n", "Reporte de autos importados", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");
        System.out.println("Porfavor ingrese el numero de autos:");
        numauto = entrada.nextInt();
        entrada.nextLine();
        while (numauto >= contador) {
            System.out.println("Ingrese la marca del auto:");
            marca = entrada.nextLine();
            System.out.println("Ingrese el origen del auto:");
            origen = entrada.nextLine();
            System.out.println("Ingrese el costo del auto:");
            costo = entrada.nextDouble();
            entrada.nextLine();
            if (origen.equalsIgnoreCase("argentina")) {
                impuesto = costo * 0.2;
                contador1 = contador1 + 1;
            } else if (origen.equalsIgnoreCase("colombia")) {
                impuesto = costo * 0.25;
                contador2 = contador2 + 1;
            } else if (origen.equalsIgnoreCase("chile")) {
                impuesto = costo * 0.3;
                contador3 = contador3 + 1;
            } else {
                impuesto = costo * 0.4;
                contador4 = contador4 + 1;
            }
            precioventa = costo + impuesto;

            reporte = reporte + String.format("%-16s%-16s%-16.2f%-16.2f%-16.2f\n", marca, origen, costo, impuesto, precioventa);

            impuestototal = impuestototal + impuesto;
            ventatotal = ventatotal + precioventa;
            contador = contador + 1;

        }

        System.out.printf(reporte);
        System.out.printf("Total autos\t%d\tTot. Imps\t\t%.2fTot. PV\t%.2f\nArgentina\t\t%d\nColombia\t\t%d\nChile\t\t\t%d\nResto de paises\t\t%d\n", numauto, impuestototal, ventatotal, contador1, contador2, contador3, contador4);

    }

}
