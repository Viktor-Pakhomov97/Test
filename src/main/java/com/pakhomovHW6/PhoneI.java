package com.pakhomovHW6;


import java.sql.Time;
import java.time.LocalTime;

public interface PhoneI<P> {
    /**
     * a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
     * b) сведения об абонентах, которые пользовались междугородной связью;
     * c) сведения об абонентах в алфавитном порядке.
     * д) сведения об первых 10 абонентов у который самый большой трафик интернета
     */
    Time limit = Time.valueOf("00:30:00");
    Time limit2 = Time.valueOf("00:00:00");

    void limitCity(Phone[] mas);

    void limitIntel(Phone[] mas);

    void traffic(Phone[] mas);


}


