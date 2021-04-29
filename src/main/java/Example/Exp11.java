package Example;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Exp11 {

    private static int elementData[] = {1, 2, 3};

    public static void main(String[] args) {
        add(2, 6);
        System.out.println("-----");
        add(0, -8);
        System.out.println("-----");
        add(1, 9);
        System.out.println("-----");
        add(6, 10);
    }

    static void add(int index, int value) {
        elementData = Arrays.copyOf(elementData, elementData.length + 1);
        //увеличиваем размер массива на +1 чтобы поместился новый элемент

        System.arraycopy(elementData, index, elementData, index + 1, elementData.length - index - 1);
        //копируем хвост после указанного индекса вставки

        System.out.println("1 фаза " + Arrays.toString(elementData));//1 фаза

        elementData[index] = value;

        System.out.println("2 фаза " + Arrays.toString(elementData));//2 фаза

    }
}