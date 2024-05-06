package com.yk3;

public class Main {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        Crow crow = new Crow();

        crow.walk("Ворона");
        crow.fly();
        ostrich.walk("Страус");
        ostrich.hiedeHead();
    }
}
