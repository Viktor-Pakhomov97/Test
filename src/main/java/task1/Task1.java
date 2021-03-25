package task1;

public class Task1 {
    public static void main(String[] args) {
        /**
         * int a = 10;
         * int b = 20;
         * int c ?
         * Если а>b тогда c =25,
         * если a>5 && b<15 тогда с = а
         * если а<0 && b<0 тогда с = -15
         * остальное с =0
         */
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = 0;

        c = a>b ? 25: (a>5 && b<15? a:(a<0&&b<0? -15:0));
        System.out.println(c);
        if (a > b) {
            c = 25;
        } else if (a > 5 && b < 15) {
            c = a;

        } else if (a < 0 && b < 0) {
            c = -15;

        }
        System.out.println(c);

    }
}
