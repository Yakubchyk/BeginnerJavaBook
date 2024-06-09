package com.yk8_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vova", 25);
        Person person2 = new Person("Viva", 18);
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);

        System.out.println(list);


    }
}
