public class Operaciones3 {
    public static void main(String args[]) {
        int num_uno = 5, num_dos = 3, res = 0, parametro = 2;

        switch(parametro) {
            case 1: res = num_uno + num_dos;
            System.out.println("El resultado de la suma es " + res);
            break;
            case 2: res = num_uno - num_dos;
            System.out.println("El resultado de la resta es " + res);
            break;
            case 3: res = num_uno * num_dos;
            System.out.println("El resultado de la multiplicacion es " + res);
            break;
            case 4: res = num_uno / num_dos;
            System.out.println("El resultado de la divicion es " + res);
            break;
            default: System.out.println("Error, la opcion no existe");
        }
    }
}