package Example;


import java.util.Arrays;
import java.util.Collections;

public class Hello {
    public static void main(String[] args) {

        /**p1[0] = new int[1];
         p1[1] = new int[2];
         p1[2] = new int[3];
         p1[3] = new int[4];
         p1[4] = new int[5];
         p1[5] = new int[6];
         p1[6] = new int[7];
         p1[7] = new int[8];
         p1[8] = new int[9];
         p1[9] = new int[10];

         for (int i = 0; i < p1.length; i++) {

         for (int j = 0; j <p1[i].length ; j++) {
         System.out.print(p1[i][j]+" ");
         }
         System.out.println();
         }
         int number = 10;
         int array[][] = new int[number + 1][number + 1];
         for (int i = 0; i <= number; i++) {
         array[i][0] = array[i][i] = 1;
         for (int j = 1; j < i; j++) {
         array[i][j] = array[i - 1][j - 1]
         + array[i - 1][j];

         }
         }

         for (int i = 0; i <= number; i++) {
         for (int j = 0; j <= i; j++) {
         System.out.format("%d", array[i][j]);
         System.out.print(" ");
         }
         System.out.println();

         }
         int arrayOfValues[][] = new int[10][10];
         for (int i = 0; i < arrayOfValues.length; i++) {
         arrayOfValues[i] = new int[i + 1];
         arrayOfValues[i][0] = 1;
         arrayOfValues[i][i] = 1;
         for (int k = 1; k < i; k++) {
         arrayOfValues[i][k] = arrayOfValues[i - 1][k - 1] + arrayOfValues[i - 1][k];
         }
         }

         for (int n = 0; n < arrayOfValues.length; n++) {
         for (int k = 0; k < arrayOfValues[n].length; k++) {
         System.out.format("%d", arrayOfValues[n][k]);
         System.out.print(" ");
         }
         System.out.println();
         }*/

        int masNumb[] = new int[100];
        for (int i = 1; i < masNumb.length; i = i + 2) {
            masNumb[i] = i;

        }
        System.out.println(Arrays.toString(masNumb));
        Integer masNumb2[] = new Integer[masNumb.length];
        for (int i = 0; i < masNumb.length; i++) {
            masNumb2[i] = masNumb[i];
        }
        Arrays.sort(masNumb2, Collections.reverseOrder());
        System.out.println(Arrays.toString(masNumb2));
        int masNumb3[] = new int[15];
        int sumNumb = 0;
        for (int i = 0; i < masNumb3.length; i++) {
            masNumb3[i] = (int) (Math.random() * 9);
            if (masNumb3[i] % 2 == 0) {
                sumNumb++;
            }
        }
        System.out.println(Arrays.toString(masNumb3));
        System.out.println(String.format("in array masNumb3 %d even numbers", sumNumb));
        int[] masNumb4 = new int[12];
        int min = 15;
        int minIdex = 0;
        for (int i = 0; i < masNumb4.length; i++) {
            masNumb4[i] = (int) (Math.random() * 30 - 15);

        }
        for (int i = 0; i < masNumb4.length; i++) {
            if (masNumb4[i] < min) {
                min = masNumb4[i];
                minIdex = i;
            }
        }
        System.out.println(Arrays.toString(masNumb4));
        System.out.println("min number: " + min);
        System.out.println("minIdex: " + minIdex);

        int saveMas[][] = new int[2][3];
        for (int i = 0; i < saveMas.length; i++) {
            for (int j = 0; j < saveMas[i].length; j++) {
                saveMas[i][j] = 3 * i + j;
            }
        }
        for (int i = 0; i < saveMas.length; i++) {
            for (int j = 0; j < saveMas[i].length; j++) {
                System.out.print(saveMas[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < saveMas.length; i++) {
            for (int j = i+1; j <saveMas[i].length; j++) {
                int exe =saveMas [i] [j];
                saveMas [i] [j] = saveMas [j] [i];
                saveMas [j] [i] = exe;
            }
        }
        for (int i = 0; i < saveMas.length; i++) {
            for (int j = 0; j < saveMas[i].length ; j++) {
                System.out.print(saveMas[i][j] + " ");

            }
            System.out.println();
        }

    }
}