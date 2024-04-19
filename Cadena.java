import java.util.Scanner;

public class Cadena {
    public static void main(String args[]) {
        String cadena_uno = "", cadena_dos = "";
        int num_caracteres = 0, desde = 0, hasta = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Escriba el primer string: ");
        cadena_uno = in.nextLine();
        num_caracteres = cadena_uno.length();
        System.out.println("El string " + cadena_uno + " tiene "
                            + num_caracteres + " caracteres.");
        System.out.print("Desde que caracter quieres modificarlo: ");
        desde = in.nextInt();
        System.out.print("Hasta que caracter quieres modificarlo: ");
        hasta = in.nextInt();
        cadena_dos = cadena_uno.substring(desde, hasta);
        System.out.println("Tu nuevo string es: " + cadena_dos);
    }
}