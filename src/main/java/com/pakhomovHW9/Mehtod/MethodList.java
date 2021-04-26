package com.pakhomovHW9.Mehtod;

import Example.ExmplToo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodList {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Александр");
        name.add("Виктор");
        name.add("Стефан");
        name.add("Александр");
        name.add("Петя");
        name.add("Александр");
        name.add("Александр");
        System.out.println(name);
        Deletion delit = new Deletion();
        delit.delete(name);
    }
    static class Deletion{
        void delete(List<String> name){
            name = name.stream().distinct().collect(Collectors.toList());
            System.out.println(name);
        }
    }
}
