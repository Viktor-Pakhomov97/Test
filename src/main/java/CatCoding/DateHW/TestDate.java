package CatCoding.DateHW;

public class TestDate {
    public static void main(String[] args) {
        Date printDate = new Date();
        Date printDate2 = new Date(03, 11, 1997);
        System.out.println(printDate2);
        Date printDate3 = new Date(printDate2);
        System.out.println(printDate3);
        printDate2.setDate(19, 04, 2021);
        System.out.println(printDate2);
        printDate3.setCopyDate(printDate2);
        System.out.println(printDate2.getDay() + " " + printDate2.getMonth() + " " + printDate2.getYear());
        Date printDate4 = new Date(04, 13, 2000);
        printDate4.nextDay();
        printDate4.nextYear();
        printDate4.nextMonth();
        System.out.println(printDate4);
        printDate.correctlyDate("01 января 1971");


    }

}
