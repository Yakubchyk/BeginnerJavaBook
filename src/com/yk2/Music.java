package com.yk2;

public enum Music {
    POP(4, "pop"), ROCK(2, "rock"), CLASSIC(1, "classic"), FOLK(3, "folk");
    private int a;
    private String name;

    Music(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public String getName() {
        return name;
    }
    public void foo() {
        System.out.println("Данный метод работает.");
        System.out.println(getA());
        System.out.println(getName());
    }

}

