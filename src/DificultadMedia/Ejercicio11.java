package DificultadMedia;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese tipo de motor: ");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe el valor válido para tipo de bomba");
        }
    }

}
