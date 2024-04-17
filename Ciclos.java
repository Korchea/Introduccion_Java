public class Ciclos {
    public static void main(String args[]) {
        int i = 0;

        System.out.println("Ciclo For");
        for (i = 1; i <= 10; i++) {
            if (i != 10) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        i = 1;
        System.out.println("");
        System.out.println("Ciclo while");
        while (i <= 10) {
            if (i != 10) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
            i++;
        }
        i = 1;
        System.out.println("");
        System.out.println("Ciclo do while");
        do {
            if (i != 10) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
            i++;
        } while (i <= 10);
        i = 1;
        System.out.println("");
        System.out.println("Segunda ciclo");
        System.out.println("Ciclo For");
        for (i = 1; i <= 5; i++) {
            if (i != 5) {
                System.out.print(i + ", ");
                System.out.print((100 - i) + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print((100 - i));
            }
        }
        i = 1;
        System.out.println("");
        System.out.println("Ciclo while");
        while (i <= 5) {
            if (i != 5) {
                System.out.print(i + ", ");
                System.out.print((100 - i) + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print((100 - i));
            }
            i++;
        }
        i = 1;
        System.out.println("");
        System.out.println("Ciclo do while");
        do {
            if (i != 5) {
                System.out.print(i + ", ");
                System.out.print((100 - i) + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print((100 - i));
            }
            i++;
        } while (i <= 5);
        System.out.println("");
        System.out.println("Tercer ciclo");
        System.out.println("Ciclo For");
        int a = 0, b = 1, c = 0;
        for (i = 0; i < 10; i++) {
            if (i != 9) {
                System.out.print(a + ", ");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }
        a = 0;
        b = 1;
        c = 0;
        i = 0;
        System.out.println("");
        System.out.println("Ciclo while");
        while (i < 10) {
            if (i != 9) {
                System.out.print(a + ", ");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
            i++;
        }
        a = 0;
        b = 1;
        c = 0;
        i = 0;
        System.out.println("");
        System.out.println("Ciclo do while");
        do {
            if (i != 9) {
                System.out.print(a + ", ");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
            i++;
        } while (i < 10);
        System.out.println("");
    }
}