package com.yk1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorException {

    private ABC abc;

    public void fool() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
    }
}
