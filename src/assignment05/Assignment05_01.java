package assignment05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Calculator extends JFrame {

    private final JTextField inputField;

    private final JTextField resultField;

    String num = "";

    private final ArrayList<String> eq = new ArrayList<String>();

    Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("계산기");
        this.setLayout(new BorderLayout(5, 5));

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(Color.LIGHT_GRAY);

        JLabel inputLabel = new JLabel("수식 입력");

        inputField = new JTextField(15);
        inputField.setEditable(false);

        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        JButton[] buttons = new JButton[16];
        String[] buttonNames = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "=", "CE", "/"};

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonNames[i]);
            buttons[i].addActionListener(new ActionCalculate());
            buttonPanel.add(buttons[i]);
        }

        JPanel resultPanel = new JPanel();
        resultPanel.setBackground(Color.YELLOW);

        JLabel resultLabel = new JLabel("계산 결과");

        resultField = new JTextField(15);
        resultField.setEditable(false);

        resultPanel.add(resultLabel);
        resultPanel.add(resultField);

        this.add(inputPanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
        this.add(resultPanel, BorderLayout.SOUTH);

        setSize(300, 500);
        setVisible(true);
    }

    class ActionCalculate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "CE":
                    inputField.setText("");
                    resultField.setText("");
                    break;
                case "=":
                    String result = Double.toString(calculate(inputField.getText()));
                    inputField.setText("");
                    resultField.setText(result);
                    num = "";
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    String string = inputField.getText();
                    if (string.isEmpty()) {
                        if (command.equals("-")) {
                            addText(command);
                        }
                        return;
                    } else if (isLastIsNotNum(string)) {
                        inputField.setText(string.substring(0, string.length() - 1) + command);
                    } else {
                        addText(command);
                    }
                    break;
                default:
                    addText(command);
                    break;
            }
        }
    }

    private void addText(String command) {
        if (!resultField.getText().isEmpty()) {
            inputField.setText("");
        }
        inputField.setText(inputField.getText() + command);
        resultField.setText("");
    }

    private boolean isLastIsNotNum(String string) {
        char c = string.charAt(string.length() - 1);
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private void stringToList(String inputText) {
        eq.clear();

        for (int i = 0; i < inputText.length(); i++) {
            char c = inputText.charAt(i);

            if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (!num.isEmpty()) {
                    eq.add(num);
                }
                num = "";
                eq.add(c + "");
            } else {
                num += c;
            }
        }

        eq.add(num);
    }

    private double calculate(String inputText) {
        stringToList(inputText);
        System.out.println("eq = " + eq);

        double last = 0;
        double now = 0;
        String mode = "";

        for (String s : eq) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                mode = s;
            } else {
                now = Double.parseDouble(s);

                switch (mode) {
                    case "+":
                        last += now;
                        break;
                    case "-":
                        last -= now;
                        break;
                    case "*":
                        last *= now;
                        break;
                    case "/":
                        last /= now;
                        break;
                    default:
                        last = now;
                        break;
                }
            }
        }

        return last;
    }
}

public class Assignment05_01 {
    public static void main(String[] args) {
        new Calculator();
    }
}
