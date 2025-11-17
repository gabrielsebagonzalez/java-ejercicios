package cuento;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class cuento {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombrePersonaje = teclado.nextLine();

        String cuento = "\uD83C\uDF19 La linterna y el bosque\n" +
                "\n" +
                " " + nombrePersonaje + " tenía una linterna vieja que había pertenecido a su abuelo. No brillaba mucho, pero cada vez que la encendía, la luz parecía cálida, como si tuviera vida propia. Una noche decidió llevarla al bosque detrás de su casa, convencido de que allí descubriría algo especial.\n" +
                "\n" +
                "Mientras caminaba, la luz de la linterna comenzó a intensificarse. No era un brillo normal: iluminaba solo lo que " + nombrePersonaje + " necesitaba ver. Cuando dudaba del camino, la luz señalaba una dirección; cuando el suelo era peligroso, mostraba raíces y piedras escondidas.\n" +
                "\n" +
                "De pronto, en un claro del bosque, " + nombrePersonaje + " encontró un pequeño zorro atrapado en una trampa vieja y oxidada. La linterna brilló tan fuerte que " + nombrePersonaje + " casi tuvo que cerrar los ojos. Al abrirlos, se sintió lleno de valor. Se acercó, liberó al zorro y esperó a que se fuera.\n" +
                "\n" +
                "Pero el animal no se fue. Caminó hacia él, tocó suavemente la linterna con el hocico… y esta se apagó, como si su misión hubiese terminado. El zorro miró a " + nombrePersonaje + " por última vez y se internó en la oscuridad.\n" +
                "\n" +
                "Cuando " + nombrePersonaje + " volvió a casa, notó que la linterna ya no encendía. Sin embargo, no sintió tristeza. Ahora sabía que su luz había sido un regalo: uno que lo había guiado justo donde tenía que estar.\n" +
                "\n" +
                "Esa noche, por primera vez, " + nombrePersonaje + " durmió con la sensación de que el bosque también lo recordaba.";

        System.out.println(cuento);
    }
}