package com.pakhomovHW9_1;

import java.util.ArrayList;
import java.util.List;

public class TestResult {
    public static void main(String[] args) {
        Centre result = new Centre();
        String arr[] = {"Водное поло", "   Футбол   ", "   Американский футбол   "};
        List<String> collection = new ArrayList<>();
        collection.add("   UFS    ");
        collection.add("Кибер Спорт");
        result.add("Бокс");
        result.add("Самбо");
        result.add("Стрельба");
        result.print();
        System.out.println();
        result.add("Карате");
        result.print();
        result.remove("Стрельба");
        result.print();
        result.remove(1);
        result.print();
        result.addAll(arr);
        result.addAll(collection);
        result.print();
        result.getPrint(2);
        System.out.println("Размер листа " + result.size());
        result.print();
        result.contains("Футбол");
        result.trim();
        System.out.println();
        result.compare(collection);
        result.clear();
    }
}
