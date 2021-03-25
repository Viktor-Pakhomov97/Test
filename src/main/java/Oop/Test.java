package Oop;

public class Test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Sara");
        user1.setSurname("Walker");
        user1.age = 24;
        user1.setSexOfaPerson("Female");
        System.out.println(user1.getName() + " " + user1.getSurname() + " age " + user1.age + " " + user1.getSexOfaPerson());
        user1.work();
        User user2 = new User();
        user2.setName("Stefan");
        user2.setSurname("Jorikov");
        user2.age = 44;
        user2.setSexOfaPerson("Man");
        System.out.println(user2.getName() + " " + user2.getSurname() + " age " + user2.age + " " + user2.getSexOfaPerson());
        user2.eatVegetables();

        System.out.print("-----------------------------------------------");
        System.out.println();
        Car Tesla = new Car();
        Tesla.setCarBrend("Tesla");
        Tesla.setCarType("Electric");
        Tesla.color = "Black";
        Tesla.doors = 4;
        System.out.println(Tesla.getCarBrend() + "\n" + Tesla.getCarType() + "\n" + Tesla.color + "\n" + "doors: " + Tesla.doors);
        Tesla.speed();
        Tesla.toFly();
        Tesla.toRide("the car can drive", "");
        System.out.print("-----------------------------------------------");
        System.out.println();
        Animal Fibi = new Animal();
        Fibi.setName("Fibi");
        Fibi.setAge(1);
        Fibi.setBreed("Maltese");
        Fibi.color = "white";
        System.out.println("Dog: " + "\n" + Fibi.getName() + "\n" + Fibi.getAge() + " year(s)" + "\n" +
                "Breed " + Fibi.getBreed() + "\n" + "Color " + Fibi.color);
        Fibi.getEat();
        Fibi.getWalk();
        Fibi.getPoop();
        int [][] mas = new int[7][];
        for (int i = 0; i <mas.length ; i++) {
            mas[i]=new int[i+1];
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
        }
    }



