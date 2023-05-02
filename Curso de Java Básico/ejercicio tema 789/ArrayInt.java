package ejercicio789;

import java.util.ArrayList;

public class ArrayInt {

    //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    //        A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
    //        y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
    //        el primer "for" de relleno.

    public static void main(String[] args) {
        System.out.println("\n ArrayInt\n");

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            lista.add(i);
        }
        lista.removeIf(num -> num % 2 == 0);
        System.out.println(lista);
    }
}