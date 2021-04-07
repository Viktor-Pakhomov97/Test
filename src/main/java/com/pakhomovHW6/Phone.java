package com.pakhomovHW6;

import java.sql.Time;


public class Phone implements Comparable<Phone>, PhoneI {
    /**
     * Phone: id, Фамилия, Имя, Отчество, Адрес, Номер телфона,
     * Номер кредитной карточки, Дебет, Кредит, Время городских и междугородных разговоров,
     * трафик интернета
     */
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String number;
    private String nubmCreditCart;
    private double debit;
    private double credit;
    private Time cityCalls;
    private Time interCalls;
    private int traffic;

    public Phone() {
    }

    public Phone(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Phone(int id, String surname, String name, String patronymic, String address, String number, String nubmCreditCart, double debit, double credit, Time cityCalls, Time interCalls, int traffic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.number = number;
        this.nubmCreditCart = nubmCreditCart;
        this.debit = debit;
        this.credit = credit;
        this.traffic = traffic;
        this.cityCalls = cityCalls;
        this.interCalls = interCalls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNubmCreditCart() {
        return nubmCreditCart;
    }

    public void setNubmCreditCart(String nubmCreditCart) {
        this.nubmCreditCart = nubmCreditCart;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", nubmCreditCart='" + nubmCreditCart + '\'' +
                ", debit=" + debit +
                ", credit=" + credit +
                ", cityCalls='" + cityCalls + '\'' +
                ", interCalls='" + interCalls + '\'' +
                ", traffic=" + traffic +
                '}';
    }

    public void limitCity(Phone mas[]) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].cityCalls.before(limit)) {
                System.out.println(mas[i] + "\n Клиент не вышел за лимиты внутрених звонков \n_________________________");
            } else if (mas[i].cityCalls.equals(limit)) {
                System.out.println(mas[i] + "\n Клиент не вышел за лимиты внутрених звонков  \n_________________________ ");
            } else {
                System.out.println(mas[i] + "\n Клиент вышел за лимиты внутрених звонков \n_________________________");
            }
        }
    }

    public void limitIntel(Phone[] mas) {
        for (int i = 0; i < mas.length; i++) {

            if (mas[i].interCalls.before(limit2)) {
                System.out.println(mas[i] + "\n Клиент не использовал международные звонки \n_________________________");
            } else if (mas[i].interCalls.equals(limit2)) {
                System.out.println(mas[i] + "\n Клиент не использовал международные звонки \n_________________________");
            } else {
                System.out.println(mas[i] + "\n Клиент использовал международные звонки \n_________________________");
            }

        }
    }



    public int compareTo(Phone otherPhone) {
        return this.surname.compareTo(otherPhone.getSurname());

    }
    public void traffic (Phone[]mas){
        int swap = 0;
        do {
            swap = 0;
            for ( int i=0; i<mas.length-1; i++){
                int grade = mas[i].getTraffic();
                int gradePlus = mas[i+1].getTraffic();
                if (grade<gradePlus) {
                    Phone tmp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1]=tmp;
                    swap++;
                }
            }
        } while (swap>0);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + "\n");
        }
    }

}

