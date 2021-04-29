package CatCoding.Animals;

public class GoTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", true);
        System.out.println(cat);
        cat.makeNoise();
        cat.eat();
        Veterinarian v = new Veterinarian();
        Animal animalCat = new Animal();
        animalCat.setFood("Житкий корм");
        animalCat.setLocation("г.одесса, пр.мира,дом 5");
        v.treatAnimal(animalCat);
        Dog dog = new Dog("Dog", true);
        System.out.println(dog);
        dog.makeNoise();
        dog.eat();
        Animal animalDog = new Animal();
        animalDog.setFood("Корм");
        animalDog.setLocation("г.Киев, пр.мира,дом 6");
        v.treatAnimal(animalDog);
        Horse horse = new Horse("Horse", true);
        System.out.println(horse);
        horse.makeNoise();
        horse.eat();
        Animal animalHorse = new Animal();
        animalHorse.setFood("Сено");
        animalHorse.setLocation("г.Львов, пр.мира,дом 7");
        v.treatAnimal(animalHorse);
        Animal [] animalsS = new Animal[3];
        animalsS[0]=cat;
        animalsS[1]=dog;
        animalsS[2]=horse;
        System.out.println("Прием ветеринара: ");
        for (int i = 0; i < animalsS.length; i++) {
            System.out.println(animalsS[i]);
        }
    }
}