
package DificultadBaja;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese temperatura en celsius: ");
        double C,F;
        C=leer.nextDouble();
        F= 32+(9*C/5);
        System.out.println("La temperatura equivale a "+ F + "F");
    }
    
    
}
// F = 32 + (9 * C / 5)