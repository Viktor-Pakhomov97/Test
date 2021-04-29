package CatCoding.OopHomwork;

public class User {
    /**
     * 1) Сделайте класс User, в котором будут следующие protected поля - name (имя),
     * age (возраст), public методы setName, getName, setAge, getAge.
     * Сделайте класс Worker, который наследует от класса User и вносит
     * дополнительное private поле salary (зарплата), а также методы public getSalary и setSalary.
     * Создайте объект этого класса 'Иван', возраст 25,
     * зарплата 1000. Создайте второй объект этого класса 'Вася', возраст 26,
     * зарплата 2000. Найдите сумму зарплата Ивана и Васи.
     * Сделайте класс Student, который наследует от класса User и
     * вносит дополнительные private поля стипендия, курс, а также геттеры и сеттеры для них.
     */
    protected String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

