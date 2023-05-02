package ejercicio789;

import java.util.*;

public class test {

    //Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

    public static void main(String[] args) {

            // Creamos un HashMap que relaciona nombres con edades
            Map<String, Integer> edades = new HashMap<>();
            edades.put("Juan", 25);
            edades.put("Maria", 30);
            edades.put("Luis", 18);

            // Creamos un ArrayList de nombres
            List<String> nombres = new ArrayList<>();
            nombres.add("Juan");
            nombres.add("Maria");
            nombres.add("Pedro");
            nombres.add("Luisa");

            // Pedimos al usuario que introduzca un nombre
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un nombre:");
            String nombre = scanner.nextLine();

            // Buscamos la edad correspondiente al nombre en el HashMap
            Integer edad = edades.get(nombre);

            // Si la edad es nula, mostramos un mensaje de error
            if (edad == null) {
                System.out.println("El nombre introducido no está en la lista.");
            } else {
                // Si la edad no es nula, mostramos la edad y la añadimos al ArrayList
                System.out.println(nombre + " tiene " + edad + " años.");
                nombres.add(nombre);
            }

            // Mostramos los nombres contenidos en el ArrayList
            System.out.println("Nombres contenidos en el ArrayList:");
            for (String n : nombres) {
                System.out.println(n);
            }

            // Pedimos al usuario que introduzca un nombre y una edad para añadir al HashMap
            System.out.println("Introduce un nuevo nombre:");
            String nuevoNombre = scanner.nextLine();
            System.out.println("Introduce la edad de " + nuevoNombre + ":");
            int nuevaEdad = scanner.nextInt();
            scanner.nextLine();

            // Añadimos el nuevo nombre y su edad al HashMap
            edades.put(nuevoNombre, nuevaEdad);

            // Mostramos los nombres y edades contenidos en el HashMap
            System.out.println("Nombres y edades contenidos en el HashMap:");
            for (Map.Entry<String, Integer> entry : edades.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

            // Pedimos al usuario que introduzca un nombre para eliminar del HashMap
            System.out.println("Introduce el nombre que quieres eliminar:");
            String nombreEliminar = scanner.nextLine();

            // Intentamos eliminar el nombre del HashMap, y mostramos un mensaje de éxito o error
            try {
                edades.remove(nombreEliminar);
                System.out.println("Nombre eliminado con éxito.");
            } catch (NullPointerException e) {
                System.out.println("El nombre introducido no está en la lista.");
            }

            // Cerramos el scanner
            scanner.close();
        }

    }