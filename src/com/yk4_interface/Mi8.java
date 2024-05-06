package com.yk4_interface;

public class Mi8 extends Helecopter implements VerticalTakeof {

    @Override
    public void fly() {
        System.out.println("Вертолет.");
    }

    @Override
    public void verticalTakeof() {
        System.out.println("Вертикальный взлет.");
    }
}
