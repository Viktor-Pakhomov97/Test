package com.pakhomovHW7;


public class TestCollection {
    public static void main(String[] args) {
        Collection c1 = new Collection();
        c1.addIndex("4", 2);
        c1.addIndex("5", 2);
        c1.addValue("0");
        c1.addValue("6");
        c1.removeIndex(2);
        c1.removeElement("1");
        c1.printIdexList(0);


    }
}
