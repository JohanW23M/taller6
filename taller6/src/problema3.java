/**Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas
 * según la región y el peso del paquete. Si el peso es menor de 5 kg y la región es
 * "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de 
 * $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 * 
 * @author: Johan Wang
 */


import java.util.Scanner;
public class problema3 {
    public static void main(String[] args) {
        double peso, costo;
        String ubicacion;
        costo = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el peso del paquete:");
        peso = teclado.nextDouble();
        System.out.print("Ingrese la ubicacion del destino (1.Nacional. 2. Internacional. 3.Local.):");
        ubicacion = teclado.next();
        
        if (peso > 4 && peso <= 10 && ubicacion.equals("Nacional"))
        {
            costo = 10;
        }
        else if ( peso <= 4 && ubicacion.equals("Local"))
        {
            costo = 5;
        }
        else 
        {
            costo = 15;
        }
       
        System.out.printf("Costo de envio del paquete: $%.2f\n", costo);
    }
}

/**
 * Salida:
 * debug:
Ingrese el peso del paquete:5
Ingrese la ubicacion del destino (1.Nacional. 2. Internacional. 3.Local.):Nacional
Costo de envio del paquete: $10,00
BUILD SUCCESSFUL (total time: 13 seconds)

 */