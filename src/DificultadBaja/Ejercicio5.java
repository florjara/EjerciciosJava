
package DificultadBaja;

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese numero");
        int num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;
        double raiz= Math.sqrt(num); 
        
         System.out.println("el doble es " + doble);       
         System.out.println("el triple es " + triple);
         System.out.println("la raiz cuadrada es " + raiz);
    }
    
}
