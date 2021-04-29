package com.pakhomovHW9_1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Centre implements CustomCollection {
    ListNode head;
    int exmpNumber = 0;
    Collection<String> exmp = new ArrayList<>();

    public Centre() {
        head = null;
    }

    void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print("[" + temp.element + "] ");
            temp = temp.next;

        }
        System.out.println();
    }

    public boolean add(String element) {
        ListNode temp = new ListNode(element);
        temp.next = head;
        head = temp;
        return true;
    }

    public boolean remove(int index) {
        ListNode current = head;
        ListNode prev = null;
        if (index == 0 && current != null) {
            head = current.next;
            System.out.println("Удаление индекса " + index);
        }
        int counter = 0;
        while (current != null) {

            if (counter == index) {
                prev.next = current.next;
                break;
            } else {

                prev = current;
                current = current.next;
                counter++;
            }
        }
        if (current == null) {
            System.out.println(
                    index + " position element not found");
        }
        return true;

    }

    public boolean remove(String str) {
        ListNode current = head;
        ListNode previous = head;
        while (current.element != str) {
            previous = current;
            current = current.next;
            if (current == head) {
                head = head.next;
            } else
                previous.next = current.next;
        }
        return true;
    }

    public boolean addAll(String[] array) {
        for (int i = 0; i < array.length; i++) {
            ListNode temp = new ListNode(array[i]);
            temp.next = head;
            head = temp;
        }
        return true;
    }

    public boolean addAll(List<String> collection) {
        for (int i = 0; i < collection.size(); i++) {
            ListNode temp = new ListNode(collection.get(i));
            temp.next = head;
            head = temp;

        }
        return true;
    }

    public String getPrint(int index) {
        int c = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            c++;
            if (c == index)
                System.out.print("[" + temp.element + "] ");
        }
        System.out.println();
        return null;
    }

    public int size() {
        int c = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            c++;
            exmpNumber++;
        }
        return c;
    }

    public boolean clear() {
        ListNode temp = head;
        for (int i = 0; i < exmpNumber; i++) {
            temp.element = null;
            System.out.print(temp.element + " ");
        }
        System.out.println();
        return true;
    }


    public boolean contains(String str) {

        ListNode temp = head;
        for (int i = 0; i < exmpNumber; i++) {
            boolean result = temp.element.contains(str);
            temp = temp.next;
            if (result == true) {
                System.out.println("Индекс " + "[" + i + "] совпадает");
            }
        }
        return true;
    }

    public boolean trim() {
        ListNode temp = head;
        for (int i = 0; i < exmpNumber; i++) {
            System.out.print("[" + temp.element.trim() + "] ");
            temp = temp.next;
        }
        return true;
    }

    public boolean compare(List ex) {
        ListNode temp = head;
        int result=0;
        for (int i = 0; i <exmpNumber; i++) {
             result = temp.element.compareTo(String.valueOf(ex));
        }
        if (result == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return true;
    }
}