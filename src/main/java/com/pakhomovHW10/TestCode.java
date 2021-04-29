package com.pakhomovHW10;

public class TestCode {
    public static void main(String[] args) {
        Collection cl1 = new Collection();
        cl1.add("1", 1);
        cl1.add("1", 1);
        cl1.add("1", 1);
        cl1.add("1", 1);
        cl1.add("6");
        cl1.get(3);
        cl1.contain("6");
        cl1.equals(cl1.getMas2());
        cl1.remove("6");
        Iterator iterator = cl1.getIterator();
        System.out.println("Номера: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        cl1.clear();
        cl1.size();


    }
}
