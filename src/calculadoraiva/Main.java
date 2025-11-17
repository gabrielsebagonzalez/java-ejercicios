package calculadoraiva;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        float IVA = 21;

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); // Configurar para Argentina

        System.out.print("Ingrese el precio del producto: ");
        float precio = teclado.nextFloat();
        float precioIva = precio * IVA / 100;  // Corregido: dividir entre 100
        float precioFinal = precio + precioIva;

        System.out.println("\n---RESUMEN---");
        System.out.printf("Precio base: $%.2f%n", precio);
        System.out.printf("IVA (21%%): $%.2f%n", precioIva);  // Corregido: sin %% extra ni :
        System.out.printf("Precio final: $%.2f%n", precioFinal);  // Corregido: sin :

        teclado.close();
    }
}
