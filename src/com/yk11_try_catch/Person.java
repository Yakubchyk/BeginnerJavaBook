package com.yk11_try_catch;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws AgeExtencion{
        if (age < 18) {
            throw new AgeExtencion("Возраст не достиг 18 лет.");
        } else {
            System.out.println("Вход разрешен!. ");
        }

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
