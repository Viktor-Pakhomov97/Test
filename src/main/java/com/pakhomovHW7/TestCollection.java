package com.pakhomovHW7;



public class TestCollection {
    public static void main(String[] args) {
        Collection c1 = new Collection();
        c1.addIndexValue(0,"1");
        c1.addIndexValue(1,"2");
        c1.addIndexValue(2,"3");
        c1.addIndexValue(3,"4");
        c1.addIndexValue(4,"5");
        c1.addValue("6");
        c1.removeIndex(1);
        c1.removeValue("5");
        c1.printIdexList(2);
    }
}
