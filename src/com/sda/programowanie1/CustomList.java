package com.sda.programowanie1;

import java.util.Arrays;

//todo implementacja wlasnej ArrayListy
public class CustomList <E> {

private int size = 0;
private final  int DEFAULT_CAPACITY = 10;

private Object elements[];

public CustomList(){
    elements = new Object[DEFAULT_CAPACITY];
}
public void add (E e){
    if (size == elements.length){
        resize();
    }
    elements[size++] = e;
}

public void resize(){
    int newSize = elements.length * 2;

    Object tmp[] = new Object[newSize];
    for (int i = 0; i< elements.length; i++){
        tmp[i] = elements[i];
    }
    elements = tmp;

    //todo inne rozwiazanie    elements = Arrays.copyOf(elements,newSize);

}

    public E get(int i){
    if(i>=size || i < 0){
        throw new IndexOutOfBoundsException("Nie ma takiego elementu");
    }
    return (E) elements[i];
    }


    public void remove (int index){
    //miejsce w tablicy ktore usuwamy
        for (int i = index -1; i < size; i++){
            elements[i] = elements [i + 1];
        }
        size --;
    }

    public int size(){
        return  size;
    }

}
