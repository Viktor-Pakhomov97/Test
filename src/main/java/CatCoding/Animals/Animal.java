package CatCoding.Animals;

public class Animal {
    private String location;
    private String food;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void makeNoise(){
    }
    public void eat(){

    }
    public void sleep(){
        System.out.println("Животное спит");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "location='" + location + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
