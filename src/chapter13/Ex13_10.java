package chapter13;

import javax.swing.*;
import java.awt.*;

public class Ex13_10 {
    static class MyGUI extends JFrame {
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("컴포넌트 연습 4");

            this.setLayout(new FlowLayout());

            String[] pet = {"고양이", "강아지", "토끼", "코알라", "송아지", "코끼리", "원숭이", "새", "거북이"};

            JList list = new JList(pet);
            this.add(list);
            this.add(new JScrollPane(list));

            JComboBox combo = new JComboBox(pet);
            this.add(combo);

            setSize(200, 200);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
