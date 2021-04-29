package CatCoding.PhoneHW;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);// вызов конструктора с двумя парам.
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;//конструктор с двумя парам
        this.model = model;
    }

    public Phone() {//конструктор без параметров
        this.number= number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String receiveCall(String name) {
        System.out.println("Звонит " + name);
        return name;
    }
    public String receiveCall(String name,String number){
        System.out.println("Звонит " + name+"\n Номер "+number);
        return name+number;
    }
    public String getNumber(String number) {
        System.out.println(number);
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void sendMessage(String phoneNumber,String [] numb){
        for (String phones:numb) {
            System.out.println("Телефоны, которым будет оправлено смс"+phoneNumber+" "+phones);

        }
    }
}

