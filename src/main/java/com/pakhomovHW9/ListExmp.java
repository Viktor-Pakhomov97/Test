package com.pakhomovHW9;


import java.util.Arrays;
import java.util.Collection;

public class ListExmp implements CustomCollection {
    String[] mas = new String[0];

    public String[] getMas() {
        return mas;
    }

    public void setMas(String[] mas) {
        this.mas = mas;
    }

    public boolean add(String str) {
        mas = Arrays.copyOf(mas, mas.length + 1);
        int indexExp = mas.length;
        mas[indexExp - 1] = str;
        System.out.println(Arrays.toString(mas));
        return true;
    }


    public boolean addAll(String[] strArr) {
        String[] mas2 = new String[mas.length + strArr.length];
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            mas2[i] = mas[i];
            count++;
        }
        for (int j = 0; j < strArr.length; j++) {
            mas2[count++] = strArr[j];
        }
        mas = mas2;
        System.out.println(Arrays.toString(mas));
        return true;
    }


    public boolean addAll(Collection strColl) {
        return true;
    }


    public boolean delete(int index) {
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


    public boolean delete(String str) {
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            if (str.equals(mas[i])) {
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


    public String get(int index) {
       return mas[index];
    }


    public boolean contains(String str) {
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            boolean result = mas[i].contains(str);
            if (result == true) {
                index=i;
            }
        }
        System.out.println("Совпадения "+str+" найдены в индексе: "+index);
        return true;
    }


    public boolean clear() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = null;
        }
        System.out.println(Arrays.toString(mas));
        return true;
    }


    public int size() {
        int size = mas.length;
        return size;
    }


    public boolean trim() {
        for (int i = 0; i < mas.length; i++) {
            mas[i]=mas[i].trim();
        }
        System.out.println(Arrays.toString(mas));
        return true;
    }


    public boolean compare(Collection  coll) {

        return true;
    }
}
