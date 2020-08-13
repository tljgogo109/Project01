package com.tlj.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    public HelloWorld() {
    }

    public static void main(String[] args) {

        Date date = new Date();
        try {
            FileInputStream fis = new FileInputStream("java.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList list = new ArrayList();
        list.add(1);

        System.out.println("Hello world!!!");

    }

}
