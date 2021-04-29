package CatCoding.OopHomwork;

public class Driver extends Worker {
    private int driverExp;
    private String category;

    public Driver(String name, int age, int salary, int driverExp,String category) {
        super(name, age, salary);
        this.driverExp = driverExp;
        this.category = category;

    }

    public int getDriverExp() {
        return driverExp;
    }

    public void setDriverExp(int driverExp) {
        this.driverExp = driverExp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", driverExp=" + driverExp +
                ", category='" + category +
                '}';
    }
}
