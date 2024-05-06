package com.yk2;

import java.util.Arrays;

public class Transport {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", coordinate=" + Arrays.toString(coordinate) +
                '}';

    }
}
