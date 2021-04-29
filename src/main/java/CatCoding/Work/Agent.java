package CatCoding.Work;

public class Agent extends Employee {
    private double amount;

    public Agent(double a) {
        amount = a;
    }

    public double salary() {
        return 5000 + 0.05 * amount;
    }
}
