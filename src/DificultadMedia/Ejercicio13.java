/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. 
 */
package DificultadMedia;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int limite, suma, ingresado;
        suma = 0;
        ingresado = 0;

        //INGRESE VALOR LIMITE POSITIVO
        do {
            System.out.println("Ingrese valor limite positivo: ");
            limite = leer.nextInt();
        } while (limite <= 0);

        //solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial
        do {
            System.out.println("ingrese numero");
            ingresado = leer.nextInt();

            if (limite > suma) {
                suma += ingresado;
            } else {
                break;
            };
        } while (limite > suma);
        System.out.println("La suma es " + suma);
    }

}
