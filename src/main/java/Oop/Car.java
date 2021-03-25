package Oop;

public class Car {
    private String carBrend;
    public int doors;
    public String color;
    private String carType;
    private int year;

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void speed(){
        System.out.println(carBrend+" accelerates to 100 km / h in 3 seconds");
    }
    public void toFly(){
        System.out.println("the car still can't fly");
    }
    public void toRide(String ride,String doNotRide){
        System.out.println(ride+doNotRide);
    }

}
