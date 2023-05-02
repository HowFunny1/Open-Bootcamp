package ejercicio789;

public class ArrayBidimensional {

    //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

    public static void main(String[] args) {

        System.out.println("\nEsto es un ArrayBidimensional\n");

        String[][] letras = {
                {"a", "b", "c"},
                {"d", "e", "f"}
        };

        for (int i = 0; i < letras.length; i++) {

            for (int j = 0; j < letras[i].length; j++) {

                System.out.println("uno: " + (i + 1) + " | dos" + (j + 1) + "\nEl valor es: " + letras[i][j]+ "\n");
            }
        }
    }
}