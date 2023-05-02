package ejercicio789;

import java.util.Vector;

public class EjercicioVector {

    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2.º y 3.º elemento y muestra el resultado final.

    public static void main(String[] args) {

        System.out.println("\nVector\n");

        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println(vector+ "\n");

        vector.remove(1);
        vector.remove(1);

        System.out.println(vector);

        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        System.out.println("cada vez que sobrepasa el limite establecido se duplica");
    }
}