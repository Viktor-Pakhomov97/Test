package com.pakhomovHW4;

/**
 * Создать класс машина с полями
 * объем бака
 * остаток в баке
 * расход топлива на 100 км
 * создать методы:
 * залить полный бак с учетом объема остатка
 * определить остаток топлива по преодолении N км
 * определить сколько надо до заправить топлива при преодолении N км
 * в классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
 * + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
 * + сколько будет стоить полная поездка
 * до Киева 479 км
 * до Кривого озера 178 км
 * до Жашко 327 км
 * 100 - 14
 * 178 - х
 * 100-14
 * 301-x
 */

public class Car {
    private double valume;//60 l
    private double remainder;//1
    private double consumption; //14 l

    public double getValume() {
        return valume;
    }

    public void setValume(double valume) {
        this.valume = valume;
    }

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void fullTank() {
        while (valume > remainder) {
            remainder++;
        }
    }

    public double gasolinePointN(double n) {
        remainder = remainder - ((consumption * n) / 100);
        System.out.print(remainder);
        return n;
    }

    public void refuelgGasoline() {
        System.out.println("Нужно заправить: 4 литра");
        for (int i = 0; i < 4; i++) {
            remainder++;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "valume=" + valume +
                ", remainder=" + remainder +
                ", consumption=" + consumption +
                '}';
    }
}
