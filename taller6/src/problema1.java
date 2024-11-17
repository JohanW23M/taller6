

/**
 *Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador 
 * de Sistemas Informáticos para programar su sistema de compras online, el cual 
 * calcule el precio total de la compra para un cliente. Para ello, se necesita 
 * utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), 
 * sin aplicar ciclos repetitivos.

Requisitos:

La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío
* del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción
* descrita en el punto 3.b.
El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, 
* descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de la compra 
* (sin descuentos o gastos de envío), supera los $1000, se le otorga un 20% de descuento; 
* y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es
* mayor a $5000, el envío será gratuito. c. El IVA del 10% se debe aplicar a todos los
* artículos antes de agregar cualquier tipo de descuesto o promoción.
 * @author Johan Wang
 */

import java.util.Scanner;

public class problema1 {
    public static void main(String[] args) {
        // Definimos precios de los productos
        double precioProducto1 = 800;
        double precioProducto2 = 1200;
        double iva = 0.10;  // IVA del 10%
        double costoEnvio = 50;  // Costo de envío si es aplicable
        double subtotal, totalConIVA, descuento = 0, totalFinal;
        int cantidadProducto1, cantidadProducto2;

        Scanner teclado = new Scanner(System.in);

        // Solicitar la cantidad de cada producto
        System.out.print("Ingrese la cantidad del producto 1 (precio $800): ");
        cantidadProducto1 = teclado.nextInt();

        System.out.print("Ingrese la cantidad del producto 2 (precio $1200): ");
        cantidadProducto2 = teclado.nextInt();

        subtotal = (cantidadProducto1 * precioProducto1) + (cantidadProducto2 * precioProducto2);

        // Calcular el total con IVA (10%)
        totalConIVA = subtotal + (subtotal * iva);

        // Verificar el descuento
        if (totalConIVA > 5000) {
            // Si la compra es mayor a $5000, el envío es gratis
            costoEnvio = 0;
            descuento = 0;  // No aplicamos descuento adicional si el envío es gratuito
        } else if (totalConIVA > 1000) {
            // Si el total con IVA supera los $1000, se aplica un 20% de descuento
            descuento = totalConIVA * 0.20;
        } else if (totalConIVA >= 1000) {
            // Si el total con IVA es al menos $1000, pero menos de $5000, el descuento es 5%
            descuento = totalConIVA * 0.05;
        }

        // Calcular el total final después de aplicar el descuento y añadir el costo de envío
        totalFinal = totalConIVA - descuento + costoEnvio;

        System.out.printf("\nDetalles de la compra:\n");
        System.out.printf("Producto 1 (cantidad: %d) a $%.2f cada uno: $%.2f\n", cantidadProducto1, precioProducto1, cantidadProducto1 * precioProducto1);
        System.out.printf("Producto 2 (cantidad: %d) a $%.2f cada uno: $%.2f\n", cantidadProducto2, precioProducto2, cantidadProducto2 * precioProducto2);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("IVA (10%%): $%.2f\n", subtotal * iva);
        System.out.printf("Descuento aplicado: $%.2f\n", descuento);
        System.out.printf("Costo de envio: $%.2f\n", costoEnvio);
        System.out.printf("Total a pagar: $%.2f\n", totalFinal);
    }
}

