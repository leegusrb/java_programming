package chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex13_11 {
    static class MyGUI extends JFrame {
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("이벤트 처리 1");

            this.setLayout(new FlowLayout());

            JButton btn1 = new JButton("버튼1");
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btn1.setBackground(Color.RED);
                }
            });
            this.add(btn1);

            setSize(200, 200);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
