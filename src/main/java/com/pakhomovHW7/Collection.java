package com.pakhomovHW7;

import java.util.ArrayList;

import java.util.List;

public class Collection {

    List<String> stringList = new ArrayList<>();

    public boolean addIndexValue(int index, String element) {
        stringList.add(index, element);
        System.out.println(stringList);
        return true;
    }

    public boolean addValue(String element) {
        stringList.add(element);
        System.out.println(stringList);
        return true;
    }

    public boolean removeIndex(int index) {
        stringList.remove(index);
        System.out.println(stringList);
        System.out.println("Размер коллекции: " + stringList.size() + " слотов");
        return true;
    }

    public boolean removeValue(String element) {
        for (int i = 0; i < stringList.size(); i++) {
            stringList.remove(element);
        }
        System.out.println(stringList);
        System.out.println("Размер коллекции: " + stringList.size() + " слотов");
        return true;
    }

    public boolean printIdexList(int index) {
        System.out.println(stringList.get(index));
        return true;
    }
}