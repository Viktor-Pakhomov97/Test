package com.pakhomovHW9_1;

import java.util.Collection;
import java.util.List;

public interface CustomCollection {
    boolean add(String element);

    boolean addAll(String[] arr);

    boolean addAll(List<String> collection);

    boolean remove (int index);

    boolean remove (String str);

    String getPrint(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compare(List coll);
}
