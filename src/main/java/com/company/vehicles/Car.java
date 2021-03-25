package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carBrend;
    private String carType;
    private double weight;


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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println(getCarBrend() + " " + getCarType() + " Вес автомобиля " + getWeight());
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Остановитесь");
    }

    public void turnRight() {
        System.out.println("Поверните на право");
    }

    public void turnLeft() {
        System.out.println("Поверните на лево");

    }

    public static void main(String[] args) {

        Driver driver1 = new Driver();
        driver1.setSurnameName("Tomas Munhen");
        driver1.setDrivingExp(26);
        Engine motor = new Engine();
        motor.setPerformance(1600);
        motor.setPower(500);
        System.out.println(driver1.getSurnameName()+" Стаж: "+driver1.getDrivingExp()+" лет"+
                "\nПроизводительность: "+ motor.getPerformance()+" Мощность: "+ motor.getPower());
        Car car1 = new Car();
        car1.setCarBrend("Tesla");
        car1.setCarType("Electric");
        car1.setWeight(1000);
        car1.printInfo();
        car1.start();
        car1.stop();
        car1.turnRight();
        car1.turnLeft();

    }
}