package com.sda.programowanie1;

public class Main {

    public static void main(String[] args) {

        CustomList<String> lista = new CustomList<>();

    lista.add("Jan");
    lista.add("Maciej");
    lista.add("John");
    lista.add("Asz");
    lista.add("Mac");
    lista.add("Dig");
    lista.add("Pock");
    lista.add("Mej");
    lista.add("Maj");
    lista.add("Mj");
    lista.add("Mak");


    for (int i = 0; i < lista.size(); i++){
        System.out.println(lista.get(i));
    }

    }
}
