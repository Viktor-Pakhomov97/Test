package CatCoding.IntelHen;

public class Hen {
    private int eggsPerMonth;
    private String country;

    public Hen() {
    }

    public Hen(int eggsPerMonth, String country) {
        this.eggsPerMonth = eggsPerMonth;
        this.country = country;
    }

    public int getEggsPerMonth() {
        return eggsPerMonth;
    }

    public void setEggsPerMonth(int eggsPerMonth) {
        this.eggsPerMonth = eggsPerMonth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCountOfEggsPerMonth() {
        return getEggsPerMonth();
    }

    public String getDescription() {
        return "Я курица";
    }
}
