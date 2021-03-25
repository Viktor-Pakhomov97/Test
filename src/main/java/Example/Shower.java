package Example;

import java.util.Scanner;

public class Shower {
    public static void main(String[] args) {
        System.out.println("---Жми на кнопку если готов---");
        Scanner button = new Scanner(System.in);
        int n = button.nextInt();
        int n1 = 20;
        if(n==1){
            for (int i = 0; i <20; i++,n1--) {
                System.out.println("Время горячей воды: "+n1);
            }
            for (int i = 0; i < 4; i++) {
                
            }

        }
    }
}
