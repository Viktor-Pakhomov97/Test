package Oop;

public class User {
    private String name;
    private String surname;
    public int age;
    private String sexOfaPerson;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSexOfaPerson() {
        return sexOfaPerson;
    }

    public void setSexOfaPerson(String sexOfaPerson) {
        this.sexOfaPerson = sexOfaPerson;
    }

    public void work() {
        System.out.println(" works at a bank");
    }

    void eatVegetables() {
        System.out.println(" has been a vegetarian for two years");
    }


}
