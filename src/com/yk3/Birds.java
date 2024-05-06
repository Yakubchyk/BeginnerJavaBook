package com.yk3;

public class Birds {
    private String name;

    public void walk(String name) {
        System.out.println(name + " гуляет....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
