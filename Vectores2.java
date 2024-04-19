import java.util.Scanner;

public class Vectores2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = 0;


        System.out.print("Escriba el largo del arreglo: ");
        x = in.nextInt();
        int numeros[] = new int[x];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese valor: ");
            numeros[i] = in.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]");
        }
        System.out.println("");
    }
}