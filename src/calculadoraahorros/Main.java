package calculadoraahorros;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //50: Necesidades
        //30: Cosas que queremos
        //20: Ahorros

        System.out.print("Ingrese su salario: ");
        Scanner teclado = new Scanner(System.in);
        float salario = teclado.nextFloat();
        float necesidades = salario * 0.5f;
        float otrasCosas = salario * 0.3f;
        float ahorros = salario * 0.2f;

        System.out.println("Deberías asignar tu salario a las siguientes cosas: ");
        System.out.println("Necesidades: $" + necesidades);
        System.out.println("Otras cosas: $" + otrasCosas);
        System.out.println("Ahorros: $" + ahorros);
    }
}

