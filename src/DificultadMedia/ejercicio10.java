package DificultadMedia;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio10 {

    /* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
//se puede hacer con charAt() o con substring
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese palabra o frase:");
        String frase = leer.nextLine();
   

        if (frase.substring(0, 1).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("incorrecto");
        }
    }

}
