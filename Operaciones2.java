public class Operaciones2 {
    public static void main(String args[]) {
        int ope = 0;
        int num_uno = 8;
        int num_dos = 4;
        int res = 0;

        if(ope == 1) {
            res = num_uno + num_dos;
            System.out.println("El resultado de la suma es " + res);
        } else if(ope == 2) {
            res = num_uno - num_dos;
            System.out.println("El resultado de la resta es " + res);
        } else if(ope == 3) {
            res = num_uno * num_dos;
            System.out.println("El resultado de la multiplicacion es " + res);
        } else if(ope == 4) {
            res = num_uno / num_dos;
            System.out.println("El resultado de la divicion es " + res);
        } else {
            System.out.println("La opcion que elegiste no existe");
        }
    }
}