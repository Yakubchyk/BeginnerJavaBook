package com.yk11_try_catch;

public class Main {
    public static void main(String[] args) throws AgeExtencion {

        int[] arr = new int[5];
        arr[0] = 5;

        try {
            arr[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такой позиции в массиве.");
        }

        Person person = new Person("Vova", 16);
        System.out.println(person);

    }
}
