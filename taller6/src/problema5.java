
import java.util.Scanner;


/**
 *Determinar el tipo de operación matemática. Dado un número del 1 al 4
 * que representa una operación matemática básica (suma, resta, multiplicación
 * , división), muestra el nombre de la operación correspondiente. Por ejemplo,
 * si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar
 * "Resta", y así sucesivamente.
 * @author Johan Wang
 */
import java.util.Scanner;
public class problema5 {
    public static void main(String[] args) {
        int operacion;
        
        System.out.print("Ingrese un numero del 1 al 4:");
        Scanner teclado = new Scanner(System.in);
        
        operacion = teclado.nextInt();
       
        switch(operacion)
        {
            case 1:
                System.out.println("Suma");;
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
          
            default: 
                System.out.println("OPERACION NO EXISTENTE");
                break;
        }
    }
}
/**
 * Salida:
 * debug:
Ingrese un numero del 1 al 4:2
Resta
BUILD SUCCESSFUL (total time: 7 seconds)

 */