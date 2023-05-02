package ejercicio789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Copiar {
    public static void main(String[] args) {
        System.out.println("\nCopiar ficheros\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("texto entrada");
        String fileIn = scanner.nextLine();
        System.out.println("texto salida");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);
    }

    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] bytes = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(bytes);
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
