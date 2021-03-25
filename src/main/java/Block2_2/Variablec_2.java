package Block2_2;

public class Variablec_2 {
    public static void main(String[] args) {
        int a = 49;
        while (a <= 200) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        int sum = 0;

        for (int i = 0; i <= 9; i++) {
            sum += i;

        }
        System.out.println(sum);
        int[] mass1 = {4, 8, 1, 2, 1, 6, 2, 0};
        int p = 1;
        for (int i = 0; i < mass1.length; i++) {
            p = p * mass1[i];

        }
        System.out.println(p);
        int[] mass2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};// второй способ
        int p1 = 0;
        for (int j = 0; j < mass2.length; j++) {
            p1 = p1 + mass2[j];

        }
        System.out.println(p1);
        int sum2 = 0;
        for (int i = 8; i < 16; i = i + 2) {
            sum2 = i + sum2;
            System.out.print(sum2 + " ");
        }
        System.out.println(sum2);
        //a(n)= a(n-1) *3+1;
        int number = 5;
        System.out.print(number+" ");
        for (int i = 0; i < 5; i++) {
            int n = (number * 3)+1;
            for (int j = 0; j <5 ; j++) {
                number = (n*3)+1;
            }
            System.out.println(n+" "+number+" ");
        }


        }

    }

