public class Promedio {
    public static void main(String args[]) {
        int mat = 5;
        int bio = 8;
        int quim = 7;
        int prom = 0;

        prom = (mat + bio + quim) / 3;
        if(prom >= 6) {
            System.out.println("El alumno aprobo con " + prom);
        } else {
            System.out.println("El alumno reprobo con " + prom);
        }

        bio = 5;
        quim = 5;
        prom = (mat + bio + quim) / 3;
        if(prom >= 6) {
            System.out.println("El alumno aprobo con " + prom);
        } else {
            System.out.println("El alumno reprobo con " + prom);
        }
    }
}