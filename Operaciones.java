public class Operaciones {
    public static void main(String args[]) {
        int num_uno = 4;
        int num_dos = 4;
        int res = 0;

        res = num_uno + num_dos / 2;
        System.out.println("El resultado incorrecto es " + res);
        res = (num_uno + num_dos) / 2;
        System.out.println("El resultado correcto es " + res);
    }
}