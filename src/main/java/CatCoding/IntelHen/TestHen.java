package CatCoding.IntelHen;

import java.util.Scanner;

public class TestHen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = sc.next();
        int eggs;
        String count;
        switch (country) {
            case "Украина":
                UkrainianHen ua = new UkrainianHen(50,"Украина");
                eggs=ua.getCountOfEggsPerMonth();
                count=ua.getDescription();
                System.out.println(eggs+" яиц"+"\n"+count);
                break;
            case "Россия":
                RussianHen ru = new RussianHen(15,"Россия");
                eggs=ru.getCountOfEggsPerMonth();
                count=ru.getDescription();
                System.out.println(eggs+" яиц"+"\n"+count);
                break;
            case "Молдова":
                MoldovanHen ml = new MoldovanHen(25,"Молдова");
                eggs=ml.getCountOfEggsPerMonth();
                count=ml.getDescription();
                System.out.println(eggs+" яиц"+"\n"+count);
                break;
            case "Беларусь":
                BelarusianHen bl = new BelarusianHen(30,"Беларусь");
                eggs=bl.getCountOfEggsPerMonth();
                count=bl.getDescription();
                System.out.println(eggs+" яиц"+"\n"+count);
                break;
            default:
                System.out.println("Такой курицы не существует");
                break;
        }
    }
}

