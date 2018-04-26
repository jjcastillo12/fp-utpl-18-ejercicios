/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberfundamentos;

import java.util.Scanner;

/*- 
Una empresa vende teléfonos celulares, en base a las siguientes consideraciones:
- Si el cliente es de tipo 1 se le descuenta 10%
- Si el cliente es de tipo 2 se le descuenta 20%
- Si el cliente es de tipo 3 se le descuenta 30%
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre;
        int tipocliente;
        int cantidadcell;
        int precio = 300;
        int subtotal;
        double valortotal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println("Seleccione que tipo de cliente es:\nTipo de cliente 1\nTipo de cliente 2\nTipo de cliente 3");
        tipocliente = entrada.nextInt();
        System.out.println("Cuantos celulares desea comprar:");
        cantidadcell = entrada.nextInt();
        subtotal = (cantidadcell * precio);

        if (tipocliente == 1) {
            double descuento = subtotal * 0.10;
            valortotal = subtotal - descuento;
            System.out.printf("Factura\nNombre: %s\nTipo de cliente: %d\nCantidad de celulares: %d\nPrecio por cada celular: %d\nSubtotal a pagar:%d\nDescuento: %.2f\nValor final a pagar: %.2f\n "
                    + "", nombre, tipocliente, cantidadcell, precio, subtotal, descuento, valortotal);
        }
        if (tipocliente == 2) {
            double descuento = subtotal * 0.20;
            valortotal = subtotal - descuento;
            System.out.printf("Factura\nNombre: %s\nTipo de cliente: %d\nCantidad de celulares: %d\nPrecio por cada celular: %d\nSubtotal a pagar:%d\nDescuento: %.2f\nValor final a pagar: %.2f\n "
                    + "", nombre, tipocliente, cantidadcell, precio, subtotal, descuento, valortotal);
        }
        if (tipocliente == 3) {
            double descuento = subtotal * 0.30;
            valortotal = subtotal - descuento;
            System.out.printf("Factura\nNombre: %s\nTipo de cliente: %d\nCantidad de celulares: %d\nPrecio por cada celular: %d\nSubtotal a pagar:%d\nDescuento: %.2f\nValor final a pagar: %.2f\n "
                    + "", nombre, tipocliente, cantidadcell, precio, subtotal, descuento, valortotal);
        }

    }

}
