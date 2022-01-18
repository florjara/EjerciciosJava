/*

 */
package DificultadMedia;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        //introduzca dos numeros enteros positivos
        System.out.println("Ingrese dos numero:");
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        //haga el menu
        System.out.println("MENU \n"
                + "1. Sumar \n"
                + "2. Restar \n"
                + "3. Multiplicar \n"
                + "4. Dividir \n"
                + "5. Salir \n");
        int resultado;
        String salir = "N";
        while (salir.equalsIgnoreCase("N")) {
            System.out.println("Elija opción: ");
            int opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    resultado = a + b;
                    System.out.println("suma: " + resultado);
                    break;
                case 2:
                    resultado = a - b;
                    System.out.println("resta: " + resultado);
                    break;
                case 3:
                    resultado = a * b;
                    System.out.println("multip: " + resultado);
                    break;
                case 4:
                    resultado = a / b;
                    System.out.println("division: " + resultado);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = entrada.next();
                    if (salir.equalsIgnoreCase("s")) {
                        break;
                    } else if (salir.equalsIgnoreCase("n")) {
                        continue;
                    } else {
                        System.out.println("Caracter inválido.");
                        break;
                    }
                default:
                    System.out.println("Valor ingresado incorrecto.");
            }
        }

    }
}
