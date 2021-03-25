package Block2_2_mass;

import java.util.Arrays;
import java.util.Scanner;

public class Massivi {
    public static void main(String[] args) {
       /** int[] prim = new int[5];
        int n = 0;
        for (int i = 0; i < prim.length; i++) {
            prim[i] = (int) (Math.random() * 6);

            if (prim[i] == 1)
                n++;
        }
        System.out.println(Arrays.toString(prim));
        System.out.println(String.format("Единица встречается столько раз: %d", n));
        */
        Scanner scanner = new Scanner(System.in);
        int[] prim2 = new int[5];
        int n2 = 0;
        int n4=0;

        for (int i = 0; i < prim2.length; i++) {
            prim2[i] = scanner.nextInt();
            n4=n4+prim2[i];
            if (prim2[i] == 1)
                n2++;
        }

        System.out.println(Arrays.toString(prim2));
        String text = (n2 <= 1) ? "Единица встречается: " + n2 + " раз" :
                "Единица встречается: " + n2 + " раз";
        System.out.println(text);
        System.out.println(String.format("Сумма введенных чисел: %d",n4));
        int[] massiv_5 = new int[10];
        int n3 = 0;
        for (int i = 0; i < massiv_5.length; i++) {
            massiv_5[i] = ((int) (Math.random() * 50));
            if (massiv_5[i] % 5 == 0)
                n3++;
        }
        System.out.println(Arrays.toString(massiv_5));
        System.out.println(String.format("Количество чисел которые кратны пяти: %d", n3));

    }
}
