package com.yk.main_hashMap;

import java.util.Map;

public class CreatePerson {

    public void createPerson() {
        ReadMap reader = new ReadMap();
        Map<String, Double> map = reader.readMap();

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            Person person = new Person(entry.getKey(), entry.getValue());
            System.out.println(person);
        }
    }
}

/*
Этот метод должен брать данные из коллекции Мар и на базе этого создавать персонажей пользуясь Классом Person.
 */