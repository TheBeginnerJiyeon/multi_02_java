package com.multi.gameProject.generalUsers.view.generalUser;

import javax.swing.*;
import java.awt.*;

// 참고로 메뉴 클릭하면 해당 페이지를 setVisible(true)로 나머지는 setVisible(false)로 바꾸면 마치 페이지 이동처럼 창 전환이 된다고 합니다.
// JTABLE

public class UserSignupPage {
    private JFrame f;
    private Font font1 = new Font("굴림", Font.BOLD, 50);
    private Font font2 = new Font("굴림", Font.BOLD, 20);
    private JPanel headerP;
    private JPanel midP;
    private JPanel footerP;
    
    public UserSignupPage() {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 800);
        f.setTitle("회원가입");
        
        initHeaderP();
        initMidP();
        initFooterP();
        
        f.add(headerP, BorderLayout.NORTH);
        f.add(midP);
        f.add(footerP, BorderLayout.SOUTH);
        
        f.setVisible(true);
    }
    
    private void initHeaderP() {
        headerP = new JPanel(); // 위
        headerP.setBackground(new Color(40, 60, 79));
        headerP.setBorder(BorderFactory.createEmptyBorder(20 , 0,  0, 0)); // 여백(=padding)
        
        JButton menuBtn1 = new JButton("회원가입");
        JButton menuBtn2 = new JButton("로그인");
        menuBtn2.setEnabled(false);
        
        menuBtn1.setFont(font2);
        menuBtn2.setFont(font2);
        
        menuBtn1.setBackground(new Color(63,228,192));
        menuBtn2.setBackground(new Color(63,228,192));
        
        headerP.add(menuBtn1);
        headerP.add(menuBtn2);
        
    }
    
    private void initMidP() {
        midP = new JPanel(); // 가운데
        midP.setBackground(new Color(40, 60, 79));
        midP.setBorder(BorderFactory.createEmptyBorder(50 , 10, 0 , 10)); // 여백(=padding)
        midP.setLayout(new GridLayout(6,2,10,10));
        
        
        JLabel idLabel = new JLabel("ID");
        
        JTextField idField = new JTextField();
        
        JLabel pwLabel = new JLabel("PW");
        JTextField pwField = new JTextField();
        
        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField();
        
        JLabel ageLabel = new JLabel("Age");
        JTextField ageField = new JTextField();
        
        JLabel telLabel = new JLabel("Tel");
        JTextField telField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email");
        JTextField emailField = new JTextField();
        
        
        idLabel.setFont(font2);
        idLabel.setOpaque(true);
        pwLabel.setFont(font2);
        pwLabel.setOpaque(true);
        nameLabel.setFont(font2);
        nameLabel.setOpaque(true);
        ageLabel.setFont(font2);
        ageLabel.setOpaque(true);
        telLabel.setFont(font2);
        telLabel.setOpaque(true);
        emailLabel.setFont(font2);
        emailLabel.setOpaque(true);
        idField.setFont(font2);
        pwField.setFont(font2);
        nameField.setFont(font2);
        ageField.setFont(font2);
        telField.setFont(font2);
        emailField.setFont(font2);
        
        midP.add(idLabel);
        midP.add(idField);
        midP.add(pwLabel);
        midP.add(pwField);
        midP.add(nameLabel);
        midP.add(nameField);
        midP.add(ageLabel);
        midP.add(ageField);
        midP.add(telLabel);
        midP.add(telField);
        midP.add(emailLabel);
        midP.add(emailField);
        
    }
    
    
    private void initFooterP() {
        footerP = new JPanel(); // 아래
        footerP.setBackground(new Color(40, 60, 79));
        footerP.setBorder(BorderFactory.createEmptyBorder(50 , 0, 50 , 0)); // 여백(=padding)
        
        JButton menuBtn = new JButton("제출");
        menuBtn.setFont(font2);
        menuBtn.setBackground(new Color(63,228,192));
        footerP.add(menuBtn);
        
        
        
    }
}
