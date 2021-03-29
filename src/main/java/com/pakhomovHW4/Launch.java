package com.pakhomovHW4;

public class Launch {
    public static void main(String[] args) {
        /*
        маршрут у нас Одесса - Киев (479 км)
        У нас есть две остановки, от Одессы до них:
        Кривого Озера 178 км
        Жашко 327 км
        что бы доехать до Киева нам нужно 66 литров топлива при расходе топлива 14 л на 100 км
         */
        Car car1 = new Car();
        car1.setConsumption(14);
        car1.setRemainder(5);
        car1.setValume(60);
        System.out.println(car1);
        System.out.println("Заправляем машину до полного бака, на данный момент " + car1.getRemainder() + " литров" +
                "\nДо Киева нам нужно 66 литров топлива");
        car1.fullTank();
        System.out.print(car1 + "\nОстаток топлива по приезду в точку Кривое Озеро: ");
        car1.gasolinePointN(178);
        System.out.println();
        car1.refuelgGasoline();
        System.out.print(car1 + "\nОстаток топлива по приезду в точку Жашко: ");
        car1.gasolinePointN(149);
        System.out.println();
        car1.refuelgGasoline();
        System.out.println(car1);
        System.out.println("Мы в Киеве, показатели топлива: ");
        car1.gasolinePointN(152);
        System.out.println();
        //Итого мы заправили 63 литра топливо + остаток, который у нас был 5 литров;
        for (String summ : args) {
            double expenses = 63.0;
            double sum = Integer.valueOf(summ);
            sum *= expenses;
            System.out.println("Затраты на топливо составили: " + sum + " UAH");
        }

    }
}
