package ejercicio789;

import java.util.Scanner;

public class Divicion {

    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
    //        ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
    //        mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

    private static int Dividir(int a, int b)throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("\nFuncion dividiendo entre 0\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("indica los que quieres dividir");
        System.out.println("numero 1: ");
        int a = scanner.nextInt();
        System.out.println("numero 2:");
        int b = scanner.nextInt();

        try {
            System.out.println(Dividir(a, b));
        }catch (ArithmeticException e){
            System.out.println("error aritmetico");
        }finally {
            System.out.println("llegaste al final");
        }
    }
}
