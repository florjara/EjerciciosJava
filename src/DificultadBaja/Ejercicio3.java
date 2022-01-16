
package DificultadBaja;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese frase");
        String frase = leer.nextLine();
        
        System.out.println("frase en minuscula  "+ frase.toLowerCase());
        System.out.println("frase en MAYUSCULA  "+ frase.toUpperCase());
        
    }
    
}
