package com.ia.demo.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Main extends JFrame {

    @Autowired
    private MainScreen mainScreen;

    public Main() {
        setResizable(false);
        setTitle("Sistema de Administraci\u00F3n de Reclamos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 231);
    }

    public void setPane(){
        setContentPane(mainScreen.$$$getRootComponent$$$());
    }
}
