package DificultadMedia;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.*/

    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
     
     System.out.println("ingrese una frase: ");
     String frase = leer.nextLine();
     
     if (frase.equals("eureka")){
         System.out.println("la frase es correcta");
     } else{
         System.out.println("la frase es incorrecta");
     }  
    }
}
