
package DificultadMedia;

import java.util.Scanner;

public class Ejercicio6 {
  
   /*Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero 1: ");
        int num1 = leer.nextInt();
        System.out.println("ingrese numero 2: ");
        int num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println("El numero 1 es mayor al numero 2");
        } else if (num1 == num2) {
            System.out.println("El numero 1 es igual al numero 2");
        } else {
            System.out.println("El numero 1 es menor al numero 2");
        }
           
                
    }
    
}
