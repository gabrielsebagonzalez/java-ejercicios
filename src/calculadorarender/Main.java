package calculadorarender;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Ingrese el precio por minuto del render: $");
        double precioRender = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de minutos: ");
        double minutos = scanner.nextDouble();

        double precioTotal = precioRender * minutos;

        System.out.println("\n---RESUMEN---");
        System.out.printf("Precio por minuto: $%.2f%n", precioRender);
        System.out.printf("Cantidad de minutos: %.2f%n", minutos);
        System.out.printf("El precio total es: $%.2f%n", precioTotal);

        scanner.close();

    }
}
