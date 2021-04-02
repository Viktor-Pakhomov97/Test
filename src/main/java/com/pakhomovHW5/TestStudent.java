package com.pakhomovHW5;

/**
 * Создать класс, спецификация которого приведена ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные
 * на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * Student: id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.
 * Создать массив объектов.
 * <p>
 * ﻿ Вывести:
 * <p>
 * a) список студентов заданного факультета; - Факульет
 * <p>
 * b) списки студентов для каждого факультета и курса; - Факультет, Группа
 * <p>
 * c) список студентов, родившихся после заданного года; - Год рождения
 * <p>
 * d) список учебной группы. - Группа
 */
//Student: id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.

public class TestStudent {
    public static void main(String[] args) {
        int id = 1111;
        Student st1 = new Student(id++, "Дорнов", "Семен", "Иванович", "01.01.1998", "Г.одесса", "380975674537", 1, 12, Student.Faculty.PROJECT_MANEGER);
        Student st2 = new Student(id++, "Cтефаньо", "Александр", "петрович", "21.04.1998", "Г.одесса", "380975674537", 1, 11, Student.Faculty.PROJECT_MANEGER);
        Student st3 = new Student(id++, "Альошкин", "Игнат", "Антонович", "01.01.2000", "Г.одесса", "380975674537", 2, 22, Student.Faculty.JAVA_ELEMENTORI);
        Student st4 = new Student(id++, "Маркиз", "Карабас", "Карабасович", "01.12.1999", "Г.одесса", "380975674537", 2, 23, Student.Faculty.JAVA_ELEMENTORI);
        Student st5 = new Student(id++, "Антан", "Стася", "семеныч", "01.01.1999", "Г.одесса", "380975674537", 3, 34, Student.Faculty.PHYTON);
        Student st6 = new Student(id++, "Ватрушка", "Петрушка", "Укропович", "01.01.2000", "Г.одесса", "380975674537", 3, 35, Student.Faculty.PHYTON);
        Student st7 = new Student(id++, "Антуан", "Аксасарян", "Амирович", "01.01.1997", "Г.одесса", "380975674537", 4, 41, Student.Faculty.MARKETING);
        Student st8 = new Student(id++, "Вартанян", "Эдуард", "Николаевич", "01.01.1999", "Г.одесса", "380975674537", 2, 23, Student.Faculty.MARKETING);
        Student st9 = new Student(id++, "Кифор", "Ванесса", "Акимовна", "01.01.1998", "Г.одесса", "380975674537", 2, 22, Student.Faculty.MARKETING);
        Student st10 = new Student(id++, "Сильчук", "Игорь", "Станиславович", "01.01.1998", "Г.одесса", "380975674537", 1, 11, Student.Faculty.PROJECT_MANEGER);
        Student st11 = new Student(id++, "Каратян", "Стольгольм", "Афанасиевич", "01.01.1999", "Г.одесса", "380975674537", 1, 12, Student.Faculty.PROJECT_MANEGER);
        Student st12 = new Student(id++, "Иркутский", "Салам", "Сергеевич", "01.01.1996", "Г.одесса", "380975674537", 2, 25, Student.Faculty.PHYTON);
        Student st13 = new Student(id++, "Румянова", "Екатерина", "Арамовна", "01.01.1995", "Г.одесса", "380975674537", 2, 26, Student.Faculty.PHYTON);
        Student st14 = new Student(id++, "Акиммована", "Лала", "Арамовна", "01.01.1995", "Г.одесса", "380975674537", 2, 25, Student.Faculty.PHYTON);
        Student st15 = new Student(id++, "Исмаилов", "Анатолий", "Анатольевич", "01.01.1996", "Г.одесса", "380975674537", 2, 26, Student.Faculty.PHYTON);
        Student st16 = new Student(id++, "Макгрегор", "Конор", "Брониславович", "01.01.1999", "Г.одесса", "380975674537", 3, 38, Student.Faculty.JAVA_ELEMENTORI);
        Student st17 = new Student(id++, "Нурмагомедов", "Хабиб", "-", "01.01.2000", "Г.одесса", "380975674537", 3, 39, Student.Faculty.JAVA_ELEMENTORI);
        Student st18 = new Student(id++, "Альварез", "Эди", "Петрович", "01.01.2000", "Г.одесса", "380975674537", 3, 38, Student.Faculty.JAVA_ELEMENTORI);

        Student[] mas1 = new Student[18];
        mas1[0] = st1;
        mas1[1] = st2;
        mas1[2] = st3;
        mas1[3] = st4;
        mas1[4] = st5;
        mas1[5] = st6;
        mas1[6] = st7;
        mas1[7] = st8;
        mas1[8] = st9;
        mas1[9] = st10;
        mas1[10] = st11;
        mas1[11] = st12;
        mas1[12] = st13;
        mas1[13] = st14;
        mas1[14] = st15;
        mas1[15] = st16;
        mas1[16] = st17;
        mas1[17] = st18;
        Student a = new Student();
        a.facultyPrint("JAVA_ELEMENTORI", mas1);
        a.facultyCoursePrint("MARKETING", 4, mas1);
        a.yearOfBirthPrint("1999", mas1);
        a.printGroup(22, mas1);

    }
}
