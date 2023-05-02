package ejercicio789;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayString {

    //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

    public static void main(String[] args) {

        System.out.println("\nArray y LinkedList\n");

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
           linkedList.add(i, list.get(i));
        }

       System.out.println("array");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("\nElements in array");
        for (String element : linkedList) {
            System.out.println(element);
        }

    }
}
