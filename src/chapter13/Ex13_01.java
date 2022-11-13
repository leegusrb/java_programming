package chapter13;

import javax.swing.*;

public class Ex13_01 {
    static class MyGUI extends JFrame {
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            setTitle("GUI 연습");
            setSize(500, 500);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
