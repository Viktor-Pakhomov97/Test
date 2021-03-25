package task1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        /**int n = 0;
        while (n< 10) {
            n++;
            System.out.println(n);
        }*/
        int n =0;
        do {
            n++;
            System.out.println(n);
        } while (n<10);


        int a = 2;//++a -> a = a + 1; 1 + a
        int b = ++a + a++ + ++a + a++ + a++;//3 + 3 (+1) + 5 + 5 (+1) + 6 (+1)
        System.out.println(a);//7
        System.out.println(b);//22


        //5) Посчитаем выражение 1-2+3-4+5-6.
        int sum = 0;
        for (int i = 1; i < 7; i+=2) {
            int n1 = i;
            int n2 = i + 1;
            System.out.println(String.format("%d - %d = ", n1, n2));
            sum+=n1 - n2;
        }
        System.out.println(sum);
        int [] a1;
        int []a2= new int[]{1,2,3};
        int []a3 = new int [5];
        int [] []  a4 = new int[4][5];
        for (int i = 0; i < a3.length; i++) {

        }
        System.out.println(Arrays.toString(a3));
    }
}
