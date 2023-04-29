package com.example.ejercicio5;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }
    String save = "guardado";
    String findAll = "buscar";
    String delete = "borrar";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
