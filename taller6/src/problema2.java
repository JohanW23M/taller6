/**
 * Problema-2
Clasificación de un triángulo Dado tres valores que representan las longitudes de 
* los lados de un triángulo, determinar su tipo. Las reglas son:
Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 * autor:Johan Wang.
 */


import java.util.Scanner;

public class problema2 {

    public static void main(String[] args) {
        double l1, l2, l3;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer lado del triangulo: ");
        l1 = teclado.nextDouble();
        System.out.print("Ingresa el segundo lado del triangulo: ");
        l2 = teclado.nextDouble();
        System.out.print("Ingresa el tercer lado del triangulo: ");
        l3 = teclado.nextDouble();

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            String tipotriangulo;
            if (l1 == l2 && l2 == l3) {
                tipotriangulo = "Equilatero";
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                tipotriangulo = "Isosceles";
            } else {
                tipotriangulo = "Escaleno";
            }

            System.out.printf("Es un triangulo: %s\n", tipotriangulo);
        } else {
            System.out.println("No es un triángulo");
        }
    }
}

/**
 * Salida:
 * debug:
Ingresa el primer lado del triangulo: 3
Ingresa el segundo lado del triangulo: 4
Ingresa el tercer lado del triangulo: 5
Es un triangulo: Escaleno
BUILD SUCCESSFUL (total time: 6 seconds)
 */