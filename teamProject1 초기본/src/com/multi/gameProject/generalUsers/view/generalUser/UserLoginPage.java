package com.multi.gameProject.generalUsers.view.generalUser;

import javax.swing.*;
import java.awt.*;

// 참고로 메뉴 클릭하면 해당 페이지를 setVisible(true)로 나머지는 setVisible(false)로 바꾸면 마치 페이지 이동처럼 창 전환이 된다고 합니다.
// JTABLE

public class UserLoginPage {
    private JFrame f;
    private Font font1 = new Font("굴림", Font.BOLD, 50);
    private Font font2 = new Font("굴림", Font.BOLD, 20);
    private JPanel headerP;
    private JPanel midP;
    private JPanel footerP;
    
    public UserLoginPage() {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 800);
        f.setTitle("로그인");
        
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
        JButton menuBtn2 = new JButton("처음 화면");
        
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
        midP.setBorder(BorderFactory.createEmptyBorder(0 , 10, 0 , 10)); // 여백(=padding)
        midP.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        
        JLabel titleL = new JLabel("로그인 화면");
        titleL.setFont(font1);
        titleL.setForeground(Color.BLACK);
        titleL.setOpaque(true);
        GridBagConstraints gbcTitleL = new GridBagConstraints();
        
        gbcTitleL.gridx = 0;
        gbcTitleL.gridy = 0;
        gbcTitleL.anchor = GridBagConstraints.WEST;
        gbcTitleL.insets.set(5, 5, 5, 5);
        gbcTitleL.gridwidth = 2;
        gbcTitleL.fill = GridBagConstraints.HORIZONTAL;
        midP.add(titleL,gbcTitleL);
        
        
        JLabel idLabel = new JLabel("ID");
        idLabel.setFont(font2);
        idLabel.setOpaque(true);
        GridBagConstraints gbcIdLabel = new GridBagConstraints();
        gbcIdLabel.gridy = 1;
        gbcIdLabel.insets.set(5, 5, 5, 5);
        midP.add(idLabel,gbcIdLabel);
        
        JTextField idField = new JTextField(20);
        GridBagConstraints gbcIdField = new GridBagConstraints();
        gbcIdField.gridx = 1;
        gbcIdField.insets.set(5, 5, 5, 5);
        midP.add(idField,gbcIdField);
        
        
        JLabel pwLabel = new JLabel("PW");
        pwLabel.setFont(font2);
        pwLabel.setOpaque(true);
        GridBagConstraints gbcPwLabel = new GridBagConstraints();
        gbcPwLabel.anchor = GridBagConstraints.WEST;
        gbcPwLabel.gridx = 0;
        gbcPwLabel.gridy = 2;
        midP.add(pwLabel,gbcPwLabel);
        
        JTextField pwField = new JTextField(20);
        GridBagConstraints gbcPwField = new GridBagConstraints();
        gbcPwField.gridx = 1;
        midP.add(pwField,gbcPwField);
 
        JButton loginBtn = new JButton("로그인");
        loginBtn.setFont(font2);
        loginBtn.setBackground(new Color(63,228,192));
        GridBagConstraints gbcLoginBtn = new GridBagConstraints();
        gbcLoginBtn.gridx = 0;
        gbcLoginBtn.gridy = 3;
        gbcLoginBtn.gridwidth = 2;
        gbcLoginBtn.fill=gbcLoginBtn.HORIZONTAL;
        gbcLoginBtn.insets.set(5, 5, 5, 5);
        midP.add(loginBtn,gbcLoginBtn);
        
        JTextArea textArea = new JTextArea();
        textArea.setFont(font2);
        textArea.setRows(10);
        GridBagConstraints gbcTextArea = new GridBagConstraints();
        gbcTextArea.gridx = 0;
        gbcTextArea.gridy = 4;
        gbcTextArea.gridwidth = 2;
        gbcTextArea.insets.set(5, 5, 5, 5);
        gbcTextArea.fill = gbcTextArea.HORIZONTAL;
        midP.add(textArea,gbcTextArea);
        

        
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
