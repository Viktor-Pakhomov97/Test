package com.timeCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Time {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List <Integer> arrayList = new ArrayList<>();
        measurTimeAdd(linkedList);
        measurTimeAdd(arrayList);
        measurTimeGet(linkedList);
        measurTimeGet(arrayList);
        measurTimeAddElement(linkedList);
        measurTimeAddElement(arrayList);

    }
    private static void measurTimeAdd (List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
           list.add(i);
        }
        //[] ->[0]->[0] [1]->...добавление в конец
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    private static void measurTimeGet (List<Integer> list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    private static void measurTimeAddElement (List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(0,i);
        }
        //добавление в начало
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
