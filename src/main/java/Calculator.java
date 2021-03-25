import java.util.Scanner;

public class Calculator {
    public int getSum(int param1, int param2) {
        return param1 + param2;
    }

    public int getMin(int param1, int param2) {
        return param1 - param2;
    }

    //division
    public double getDiv(double param1, double param2) {
        return param1 / param2;
    }

    //multiplication
    public int getMultip(int param1, int param2) {
        return param1 * param2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What operation? ('+', '-', '*', '/')");
        String operator = scanner.nextLine();
        switch (operator) {
            case ("+"):
                System.out.println(calc.getSum(1,5));
                break;
            case ("-"):
                System.out.println(calc.getMin(5,3));
                break;
            case ("/"):
                System.out.println(calc.getDiv(5,3));
                break;
            case ("*"):
                System.out.println(calc.getMultip(5,3));
                break;
        }
    }
}
