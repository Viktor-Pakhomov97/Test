package Example;

import java.util.Arrays;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                System.out.println(" Основной состав: " + mas[i]);
            } else if (i % 2 != 0) {
                System.out.println(" Запасной состав: " + mas[i]);
            }
        }
        System.out.println(Arrays.toString(mas));
    }

}

