package DificultadMedia;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
    /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo.*/

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
         
         System.out.println("Ingrese palabra o frase de 8 de largo:");
         String frase=leer.nextLine();
         
          if (8==frase.length()){
         System.out.println("la frase es correcta");
     } else{
         System.out.println("la frase es incorrecta");
     } 
         
    }

}
