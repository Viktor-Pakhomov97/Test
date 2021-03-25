package Oop;

public class Animal {
    private String name;
    private int age;
    private String breed;
    public String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void getEat(){
        System.out.println("the dog wants to eat");
    }
    public void getWalk(){
        System.out.println("the dog wants to walk");
    }
    public void getPoop (){
        System.out.println("the dog wants to poop");
    }

}
