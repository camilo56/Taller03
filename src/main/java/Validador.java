import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {




    public static String entradaString() {

        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public static int entradaInt() {

        int entrada = 0;

        try {
            entrada = Integer.parseInt(entradaString());
        } catch (NumberFormatException ex) {
            System.out.println("Entrada no válida");
        }
        return entrada;
    }
}
