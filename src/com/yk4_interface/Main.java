package com.yk4_interface;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Mi8 mi8 = new Mi8();
        Boeng737 boeng737 = new Boeng737();
        Test test = new Test();
        test.fool(mi8);
        test.foo(boeng737);

    }
}
