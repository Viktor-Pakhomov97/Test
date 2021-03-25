package Block2;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Variables {
    public static void main(String[] args) {
        int number = 0;
        for (int a = 0; a < 5; a++) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int b = 2; b < 82; b++) {
            System.out.print(b++ + " ");
        }
        System.out.println();
        for (int c = 1; c < 11; c++) {
            int number2 = c * 2;
            System.out.println(2 + "*" + c + "=" + number2);
        }


        //7 task
        int number3 = 0;
        for (int i = 0; i < 28; i++) {
            number3++;
            int result2 = i + number3;
            System.out.print(result2 + " ");

        }
        System.out.println();
        int a = 1, b = 1;  // Фибоначчи
        System.out.print(a + " " + b + " ");
        for (int i = 3; i < 11; i++) {
            int result = a + b;
            a = b;
            b = result;
            System.out.print(result + " ");
        }
        System.out.println();
        int n =ThreadLocalRandom.current().nextInt();
        System.out.println(n);
        if (n%2 !=0){
            System.out.println("Число четное");
        }
        else{
            System.out.println("Нечетное");
        }
        System.out.println();

        int number5=70;
        while (200>=number5){
            number5++;
            System.out.print(number5+" ");
        }
       /** int numberPeople;
        Scanner scanner = new Scanner(System.in);
        numberPeople= scanner.nextInt();
        int i=1;
        int sum=0;
        while (i<=numberPeople){
            sum+=i;
            i++;
        }
        System.out.println(sum);
        */

        int[] mass1 = {4, 8, 1, 2, 1, 6, 2,0};
        int p =1;
        for (int i = 0; i < mass1.length; i++) {
            p= p*mass1[i];

        }
        System.out.println(p);
        int[] mass2 = {1, 2, 3, 4, 5, 6, 7,8,9};
        int p1 =0;
        for (int j = 0; j <= mass1.length; j++) {
            p1= p1+mass2[j];

        }
        System.out.println(p1);

    }
}
