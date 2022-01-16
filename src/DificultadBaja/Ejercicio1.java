
package DificultadBaja;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio1 {

   
    public static void main(String[] args) {
   
        int num1, num2, suma;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un numero: ");
        num1= leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2= leer.nextInt();
        
         suma=num1+num2;
                 
        System.out.println("La suma es : " + suma);
        
    }
    
}
