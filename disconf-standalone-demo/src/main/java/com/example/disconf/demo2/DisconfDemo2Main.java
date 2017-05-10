package com.example.disconf.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by MST on 2017/5/9.
 */
public class DisconfDemo2Main {

    protected static final Logger LOGGER = LoggerFactory.getLogger(DisconfDemo2Main.class);

    private static String[] fn = null;

    // 初始化spring文档
    private static void contextInitialized() {
        fn = new String[] {"applicationContext2.xml"};
    }


    public static void main(String[] args) {
        contextInitialized();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(fn);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
