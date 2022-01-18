/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 

Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas.

Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package DificultadMedia;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        String cadena;
        int correcto = 0;
        int incorrecto = 0;
        do {

            System.out.println("Ingrese cadena:");
            cadena = entrada.next();

            if (!cadena.equals("&&&&&")) {
                if (cadena.length() == 5) {
                    if (cadena.substring(0, 1).equals("X")) {
                        if (cadena.substring(4).equals("O")) {
                            correcto += 1;
                        } else {
                            incorrecto += 1;
                        }
                    } else {
                        incorrecto += 1;
                    }
                } else {
                    incorrecto += 1;
                }
            }
        } while (!cadena.equals("&&&&&"));

        System.out.println("incorrectos: " + incorrecto);
        System.out.println("correctos: " + correcto);
    }

    //ERROR CON "&xxx&" ---solucionado
}
