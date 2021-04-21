package com.pakhomovHW7;

import java.util.Arrays;

public class Collection {
    private String[] mas = {"1", "2", "3"};

    boolean addIndex(String element, int indexElem) {
        mas = Arrays.copyOf(mas, mas.length + 1);
        System.arraycopy(mas, indexElem, mas, indexElem + 1, mas.length - indexElem - 1);
        mas[indexElem] = element;
        System.out.println(Arrays.toString(mas));
        return true;
    }

    boolean addValue(String element) {
        mas = Arrays.copyOf(mas, mas.length + 1);
        int indexExp = mas.length;
        mas[indexExp - 1] = element;
        System.out.println(Arrays.toString(mas));
        return true;
    }

    boolean removeIndex(int index) {
        if (index == 0) {
            String[] array2 = new String[mas.length - 1];
            System.arraycopy(mas, 1, array2, 0, array2.length);
            mas = array2;
        } else if (index == mas.length - 1) {
            String[] array2 = new String[mas.length - 1];
            for (int i = 0; i < mas.length - 1; i++) {
                array2[i] = mas[i];
            }
            mas = array2;
        } else {
            String[] array2 = new String[mas.length - 1];
            for (int i = 0; i < mas.length; i++) {
                if (i > index) {
                    array2[i - 1] = mas[i];
                }
                if (i == index) {
                    continue;
                }
                if (i < index) {
                    array2[i] = mas[i];
                }
            }
            mas = array2;

        }
        System.out.println(Arrays.toString(mas));
        return true;
    }

    boolean removeElement(String element) {
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            if (element.equals(mas[i])) {
                break;
            } else {
                index++;
            }
        }
        if (index == 0) {
            String[] array2 = new String[mas.length - 1];
            System.arraycopy(mas, 1, array2, 0, array2.length);
            mas = array2;
        } else if (index == mas.length - 1) {
            String[] array2 = new String[mas.length - 1];
            for (int i = 0; i < mas.length - 1; i++) {
                array2[i] = mas[i];
            }
            mas = array2;
        } else {
            String[] array2 = new String[mas.length - 1];
            for (int i = 0; i < mas.length; i++) {
                if (i > index) {
                    array2[i - 1] = mas[i];
                }
                if (i == index) {
                    continue;
                }
                if (i < index) {
                    array2[i] = mas[i];
                }
            }
            mas = array2;

        }
        System.out.println(Arrays.toString(mas));
        return true;
    }

    public boolean printIdexList(int index) {
        System.out.println(mas[index]);
        return true;
    }

}


