package com.example.ejercicio4;

public class SmartDevice {
    String marca;
    String modelo;
    String color;

    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("samsung","a02s","verde",4,"androi");
        SmartWatch smartWatch = new SmartWatch("a","a","a",1.1,"a");

        System.out.println("el smartphone tiene las siguientes caracteristicas "+smartPhone + "\nEl smartwhtch tiene las siguientes caracteristicas "+smartWatch);
    }
}
