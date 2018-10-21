package com.sda.programowanie1;

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
}



}
