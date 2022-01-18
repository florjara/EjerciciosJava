package DificultadMedia;

import java.util.Locale;
import java.util.Scanner;

/* 
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta. 
*/

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
           int nota ;
        
        
        do {
            System.out.println("Ingrese nota del 1 al 10: ");
            nota = leer.nextInt();

            if (nota < 11 && nota > 0) {
                System.out.println("La nota es correcta.");
                break;
            } else {
                System.out.println("La nota es incorrecta.");
            }
        } while (!(nota < 11 && nota > 0));
    }

}
