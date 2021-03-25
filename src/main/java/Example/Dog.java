package Example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Dog {

    public static void main(String[] args) {
        /**  for (int i = 0; i < 11; i++) {
         if (i % 2 == 0) {
         System.out.println(String.format("%d четное", i));
         } else {
         System.out.println("Bolt");
         }
         }
         System.out.println();
         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();
         int sum = 0;
         for (int i = 1; i <= number; i++) {
         sum += i;
         }
         System.out.println(sum + "СУММА ЧИСЛА ПОЛЬЗОВАТЕЛЯ");

         int number1 = 0;
         int sum2 = 0;
         int sum3=0;
         while (number1 <= 10) {
         number1++;
         sum2=number1;
         if (number1 % 2 == 0)
         System.out.println(sum2);
         sum3+=sum2;
         }
         System.out.println(sum3);
         int cats []= new int[5];
         for (int i = 0; i < cats.length; i++) {
         cats[i]=(int)(Math.random()*5);

         }
         System.out.println(Arrays.toString(cats));

         int[] mass1 = {4, 8, 1, 2, 1, 6, 2, 0};
         int p = 1;
         for (int i = 0; i < mass1.length; i++) {
         p = p * mass1[i];

         }
         System.out.println(p);
         int[] mass2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         int p1 = 0;
         for (int j = 0; j < mass2.length; j++) {
         p1 = p1 + mass2[j];

         }
         System.out.println(p1);

         long first = 5;
         int i = 1;
         while (i++ < 100) {
         first = 3 * first + 1;
         System.out.println("a" + i + "=" + first);
         }
         int[][] elMasMatr = {
         {1, 2, 3},
         {4, 5, 6, 7, 8},
         {7, 8, 9}
         };
         for (i = 0; i < elMasMatr.length; i++) {
         int[] test = elMasMatr[i];
         for (int j = 0; j < test.length; j++) {
         System.out.println(elMasMatr[i][j]);

         }
         System.out.println("_______________________");
         }
         long [] test2 = {0,2,4,5,6};// 0 1 2 3 4
         System.out.println(test2[4]);
         String [] test3 = new String[5];
         for (int j = 0; j < test3.length; j++) {
         System.out.println(test3[j]);
         }
         BigInteger a = BigInteger.valueOf(100);
         System.out.println(a);
         BigInteger b = new BigInteger("2494923942939429394293492394923949239429349239492929349249");
         System.out.println(b);
         int s []= new int []{5,4,6,7};

         int [] d = new int[]{5,4,6};
         System.out.println(Arrays.toString(d));
         Arrays.fill(d,0);
         System.out.println(Arrays.toString(d));

         /**
         Scanner in = new Scanner(System.in);
         System.out.println("How much money do you "+ " need to retire?");
         double goal =in.nextDouble();
         System.out.println("How much money will you "+ "contribute every year?");
         double payment = in.nextDouble();
         System.out.println("Interest rate in %: ");
         double interestRate = in.nextDouble();
         double balance = 0;
         int years =0;
         while (balance<goal)
         {
         balance+=payment;
         double interest = balance * interestRate/100;
         balance+=interest;
         years++;
         }
         System.out.println("you can retire in "+years+"years");
         */
        int[] number = new int[]{10, 5, 3, 4, 5, 6, 7, 8, 9};
        int numberConsole =8;
        int numberEx = 1;
        for (int i = 0; i < number.length; i++) {
            if (numberConsole < number[i]) {
                numberEx *= number[i];
            }

        }
        if (numberEx == 1) {

            System.out.println("В массиве отсутсвуют числа больше вашего!");
        }
        else {
            System.out.println(String.format("%d произведение от вашего числа %d",numberEx,numberConsole));
        }
    }

}



