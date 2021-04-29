package CatCoding.Animals;

public class Dog extends Animal{
    private String animal;
    private boolean walks;
    private boolean ball;

    public Dog(String animal, boolean walks, boolean ball) {
        this(animal, walks);
        this.ball = ball;
    }

    public Dog(String animal, boolean walks) {
        this.animal = animal;
        this.walks = walks;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав-гав");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println("Животное кушает");
        super.eat();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "animal='" + animal + '\'' +
                ", walks=" + walks +
                ", ball=" + ball +
                '}';
    }
}
