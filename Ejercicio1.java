import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        String nombre = "";
        int clave = 0, antiguedad = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido al sitema vacacional de Coca-Cola Company");
        System.out.println("Cual es el nombre del trabajador?");
        nombre = in.nextLine();
        System.out.println("Cuantos anos de servicio tiene el trabajador?");
        antiguedad = in.nextInt();
        System.out.println("Cual es la clave del departamento?");
        clave = in.nextInt();

        if(clave == 1) {
            if(antiguedad == 1) {
                System.out.println(nombre + ", derecho 6 dias");
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", derecho 14 dias");
            } else if(antiguedad >= 7) {
                System.out.println(nombre + ", derecho 20 dias");
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");
            }
        } else if(clave == 2) {
            if(antiguedad == 1) {
                System.out.println(nombre + ", derecho 7 dias");
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", derecho 15 dias");
            } else if(antiguedad >= 7) {
                System.out.println(nombre + ", derecho 22 dias");
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");
            }
        } else if(clave == 3) {
            if(antiguedad == 1) {
                System.out.println(nombre + ", derecho 10 dias");
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", derecho 20 dias");
            } else if(antiguedad >= 7) {
                System.out.println(nombre + ", derecho 30 dias");
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");
            }
        } else {
            System.out.println("Error, la clave del departamento no existe");
        }
    }
}