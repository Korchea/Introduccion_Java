import java.util.Scanner;

public class Suma2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num_uno = 0, num_dos = 0, res = 0;

        System.out.println("Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Dame el primer valor de la suma");
        num_uno = in.nextInt();

        System.out.println("Dame el segundo valor de la suma");
        num_dos = in.nextInt();

        res = num_uno + num_dos;
        System.out.println("Hola " + nombre + " el resultado de la suma es " + res);
    }
}