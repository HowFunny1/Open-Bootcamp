package Ejerciciotema2;
import java.util.Scanner;
public class tema2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el precio");

        System.out.println();
        double precio = scanner.nextDouble();
        double iva = 0.13;

        var precioiva = (precio*iva);
        var total = (precioiva+precio);
        System.out.println("El precio del iva es " + precioiva);
        System.out.println("El precio total es " + total);
    }
}

/*
package com.example;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int numero = scanner.nextInt();

        double iva = numero * 0.21;

        double suma = numero + iva;

        System.out.println("El resultado con IVA es: " + suma);
    }
}
 */
