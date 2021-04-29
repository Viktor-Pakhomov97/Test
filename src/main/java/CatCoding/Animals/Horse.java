package CatCoding.Animals;

public class Horse extends Animal{
    private String animal;
    private boolean hooves;
    private boolean mane;

    public Horse(String animal, boolean hooves, boolean mane) {
        this(animal, hooves);
        this.mane = mane;
    }

    public Horse(String animal, boolean hooves) {
        this.animal = animal;
        this.hooves = hooves;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println("Животное кушает");
        super.eat();
    }

    @Override
    public String toString() {
        return "Horse{" +
                "animal='" + animal + '\'' +
                ", hooves=" + hooves +
                ", mane=" + mane +
                '}';
    }
}
