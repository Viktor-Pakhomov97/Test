package com.pakhomovHW9;

import com.pakhomovHW8.Collection;

public class Test {
    public static void main(String[] args) {
        ListExmp list = new ListExmp();
        list.add("Бокс");
        list.add("Дзюдо");
        list.add("Самбо");
        String list2[] = {"Стрельба", "Спортивное самбо", "Футбол", "Хоккей"};
        list.addAll(list2);
        list.delete(3);
        list.delete("Футбол");
        System.out.println(list.get(0));
        list.contains("Хоккей");
        System.out.println("Размер листа: " + list.size());
        list.add("     UFC    ");
        list.trim();
        list.add("Самбо");
    }
}
