package ejercicio789;

import java.util.Scanner;

public class CadenaAlReves {
    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

    public static void main(String[] args) {
        System.out.println("\nEl texto que ingreses sera escrito al reves\n");


        System.out.println("Intoduce un texto\n");
        Scanner scanner = new Scanner(System.in);
        String texto;
        texto = scanner.nextLine();

        StringBuilder reves = new StringBuilder(texto);
        texto = reves.reverse().toString();

        System.out.println(texto);
    }

}
