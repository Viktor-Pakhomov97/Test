package CatCoding.Animals;

public class Cat extends Animal {

private String animal;
private boolean claws;
private boolean lovesMice;

    public Cat(String animal, boolean claws) {
        this.animal = animal;
        this.claws = claws;
    }
    public Cat(String animal, boolean claws, boolean lovesMice) {
        this(animal,claws);
        this.lovesMice = lovesMice;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу-Мяу");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println("Животное кушает");
        super.eat();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "animal='" + animal + '\'' +
                ", claws=" + claws +
                ", lovesMice=" + lovesMice +
                '}';
    }
}
