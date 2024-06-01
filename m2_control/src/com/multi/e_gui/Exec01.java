package com.multi.e_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec01 extends JFrame { //오류 찾아보기

    private JTextField textField1;
    private JTextField textField2;
    private JButton clickButton;
    private JPanel mainPanel;

    public Exec01(){
        setContentPane(mainPanel);
        setTitle("만들어보자.");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setVisible(true);

        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                JOptionPane.showMessageDialog(Exec01.this, "계산결과는 : " + (num1 + num2));
            }
        });
    }

    public static void main(String[] args) {
        new Exec01();
    }
}
