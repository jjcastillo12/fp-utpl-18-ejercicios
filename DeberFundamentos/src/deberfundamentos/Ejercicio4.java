/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberfundamentos;

import java.util.Scanner;

/*
-En una empresa dedicada a la venta de balones, si se compra uno se hace un descuento de 50%,
si se compra 2 descuento de 70%, se compra 3 o más se descuenta 80%.
Generar la solución que permita leer el número de balones a comprar, el precio de cada balón y el valor final a cancelar.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int balones;
        int preciobalon;
        int subtotal;
        double valortotal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor ingrese el numero de balones que desea comprar:");
        balones = entrada.nextInt();
        System.out.println("Ingrese el precio del balón:");
        preciobalon = entrada.nextInt();
        subtotal = preciobalon * balones;
        if (balones == 1) {
            double descuento = subtotal * 0.5;
            valortotal = subtotal - descuento;
            System.out.printf("Factura\nCantidad de balones: %d\nPrecio de cada balón: %d\nDescuento: %.2f\nSubtotal: %d\nValor total: %.2f"
                    , balones, preciobalon, descuento, subtotal, valortotal);
        }
        if (balones == 2) {
            double descuento = subtotal * 0.7;
            valortotal = subtotal - descuento;
            System.out.printf("Factura\nCantidad de balones: %d\nPrecio de cada balón: %d\nDescuento: %.2f\nSubtotal: %d\nValor total: %.2f"
                    , balones, preciobalon, descuento, subtotal, valortotal);
        }
        if (balones >=3) {
            double descuento = subtotal * 0.8;
            valortotal = subtotal - descuento;
            System.out.printf("Factura\nCantidad de balones: %d\nPrecio de cada balón: %d\nDescuento: %.2f\nSubtotal: %d\nValor total: %.2f"
                    , balones, preciobalon, descuento, subtotal, valortotal);
        }
    }
}
