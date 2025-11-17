package mayoriaedad;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puede acceder al sitio");
        } else {
            System.out.println("No puede acceder al sitio");
        }
    }
}
