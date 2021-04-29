package CatCoding.OopHomwork;

public class TestCode {
    public static void main(String[] args) {
        Worker us1 = new Worker("Ivan", 25, 1000);
        Worker us2 = new Worker("Vasya", 26, 2000);
        System.out.println(us1 + "\n" + us2 + "\n Сумма их зарплаты: " + (us1.getSalary() + us2.getSalary()));
        Student st1 = new Student("Viktor", 23, 899, 2);
        System.out.println(st1);
        Driver dr1 = new Driver("Ivan",30,2000,10,"B");
        System.out.println(dr1);
    }
}
