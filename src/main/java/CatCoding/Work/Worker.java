package CatCoding.Work;

public class Worker extends Employee {
    private double time;

    public Worker(double t) {
        time = t;
    }

    public double salary() {
        return 100 * time;
    }
}
