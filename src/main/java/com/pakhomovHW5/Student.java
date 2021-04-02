package com.pakhomovHW5;

//Student: id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.
public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic; //отчество
    private String yearOfBirth;
    private String address;
    private String phoneNumber;
    private int course;
    private int groups;
    Faculty studFacul;

    enum Faculty {
        PROJECT_MANEGER,
        JAVA_ELEMENTORI,
        PHYTON,
        MARKETING
    }

    public Student() {
    }

    public Student(int id, String surname, String name, String patronymic, String yearOfBirth, String address, String phoneNumber, int course, int groups, Faculty facul) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.groups = groups;
        studFacul = facul;
    }

    public Student(int id, String surname, String name, String patronymic, Faculty faculty, int course, int groups) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        studFacul = faculty;
        this.course = course;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroups() {
        return groups;
    }

    public void setGroups(int groups) {
        this.groups = groups;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Фамилия='" + surname + '\'' +
                ", Имя='" + name + '\'' +
                ", Отчество='" + patronymic + '\'' +
                ", Год рождения='" + yearOfBirth + '\'' +
                ", Адрес='" + address + '\'' +
                ", Телефон='" + phoneNumber + '\'' +
                ", Курс=" + course +
                ", Группа=" + groups +
                ", Факультет=" + studFacul +
                '}';

    }

    public void printGroup(int group, Student mas1[]) {
        for (Student stu : mas1) {
            if (stu.getGroups() == group) {
                System.out.println("Список студентов " + group + ": " + stu);
            }
        }
    }

    public void yearOfBirthPrint(String year, Student[] mas1) {
        System.out.println("Список студентов, родившихся после " + year + " года");
        for (Student st : mas1) {
            if (parseYear(st.getYearOfBirth().substring(6)) > parseYear(year)) {
                System.out.println(st.toString());
            }
        }
    }

    public int parseYear(String years) {
        return Integer.parseInt(years);
    }

    public void facultyCoursePrint(String faculty, int course, Student[] mas1) {
        System.out.println("Список студентов факультета " + faculty + " курса " + course);
        for (Student st : mas1) {
            if (st.studFacul.name().equals(faculty) & st.getCourse()==(course)) {
                System.out.println(st.toString());

            }
        }
    }
    public void facultyPrint(String faculty, Student[] mas1) {
        System.out.println("Список студентов факультета " + faculty);
        for (Student st : mas1) {
            if (st.studFacul.name().equals(faculty)) {
                System.out.println(st);

            }
        }
    }
}