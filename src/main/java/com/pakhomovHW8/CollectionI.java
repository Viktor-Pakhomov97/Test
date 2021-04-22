package com.pakhomovHW8;

public interface CollectionI {
    /*
boolean add(Object o);
boolean add(intex, Object o);
boolean delete (Object o);
Object get(int index);*******
boolean contain(Object o);
boolean equals (Collection str)****
boolean clear(),
int size(),
     */

    default boolean add(String element) {
        return true;
    }

    default boolean add(String element, int index) {
        return true;
    }

    default boolean remove(String element) {
        return true;
    }

    void get(int index);

    default boolean contain(String element) {
        return true;
    }

    default boolean equals(String[] masExmp) {
        return true;
    }

    default boolean clear() {
        return true;
    }

    void size();

}
