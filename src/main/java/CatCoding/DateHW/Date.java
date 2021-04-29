package CatCoding.DateHW;

public class Date {
    private int day;
    private int month;
    private int year;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        date = "01 января 1970";
        System.out.println(date);
    }

    public Date(Date date) {
        this(date.day, date.month, date.year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                day +
                " " + month +
                " " + year +
                '}';
    }

    void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    void setCopyDate(Date date) {
        System.out.println(date);
    }

    void correctlyDate(String dateExmp){
        if (date.equals(dateExmp)){
            System.out.println(date);
        } else {
            System.out.println(" Не корректный ввод");
        }

    }
    void nextDay() {
        day++;
        if (day > 30)
            day = 1;
    }

    void nextYear() {
        if (month > 12) {
            year = year + 1;
        }
    }

    void nextMonth() {
        if (month > 12) {
            month = 1;
            day = 1;

        }
    }


}
