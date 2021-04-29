package com.pakhomovHW8;


import java.util.Arrays;

public class Collection implements CollectionI {
    private String[] mas = {"1", "2", "3"};
    private String[] mas2 = {"1","1","2","3","6"};

    public String[] getMas2() {
        return mas2;
    }

    public void setMas2(String[] mas2) {
        this.mas2 = mas2;
    }

    private int count = mas.length;

    public String[] getMas() {
        return mas;
    }

    public void setMas(String[] mas) {
        this.mas = mas;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean add(String element) {
        mas = Arrays.copyOf(mas, mas.length + 1);
        int indexExp = mas.length;
        mas[indexExp - 1] = element;
        System.out.println(Arrays.toString(mas));
        return true;
    }


    public boolean add(String element, int index) {
        if (index <= count) {
            mas = Arrays.copyOf(mas, mas.length + 1);
            System.arraycopy(mas, index, mas, index + 1, mas.length - index - 1);
            mas[index] = element;
            System.out.println(Arrays.toString(mas));
        } else {
            System.out.println("Такого индекса не существует, повторите попытку");
        }
        return true;
    }

    public boolean remove(String element) {
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

    public void get(int index) {
        System.out.println("Значение идекса " + "[" + index + "]= " + mas[index]);
    }


    public boolean contain(String element) {
        for (int i = 0; i < mas.length; i++) {
            boolean result = mas[i].contains(element);
            if (result == true) {
                System.out.println("Индекс " + "[" + i + "] совпадает");
            } else {
                System.out.println("Индекс " + "[" + i + "] не совпадает");
            }
        }
        return true;
    }

    public boolean equals(String[] masExmp) {
        boolean result = Arrays.equals(mas,mas2);
        System.out.println(result);
        return true;
    }

    public boolean clear() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = null;
        }
        System.out.println(Arrays.toString(mas));
        return true;
    }


    public void size() {
        System.out.println("Размер массива данных: " + mas.length);
    }
}
