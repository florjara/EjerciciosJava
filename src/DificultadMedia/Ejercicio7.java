package DificultadMedia;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero 1: ");
        int num1 = leer.nextInt();
        
        if (num1%2==0){
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}
