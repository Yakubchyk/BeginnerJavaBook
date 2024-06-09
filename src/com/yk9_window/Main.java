package com.yk9_window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame wnd = new JFrame("Erste Fenster");
        wnd.setSize(800,600);
        wnd.setLocation(450,350);
        wnd.setResizable(false);
        wnd.getDefaultCloseOperation();
        wnd.setVisible(true);
    }
}
