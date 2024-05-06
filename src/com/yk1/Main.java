package com.yk1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        ErrorException errorException = new ErrorException();
//        errorException.fool();
        try {
            int b = 10 / 0;

        } catch (ArithmeticException ex) {
            System.out.println("На 0 делить нельзя.  " + ex);
        }


    }
}

