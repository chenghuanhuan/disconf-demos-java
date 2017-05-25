package com.example.disconf.demo2;

import com.baidu.disconf.client.usertools.IKuKoConfDataGetter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        Object server = IKuKoConfDataGetter.getStringValue("msg.topicpair2");
        System.out.println(server);
        //try {
            //System.in.read();
            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                if ("exit".equals(line)){
                    break;
                }else {
                    String object = IKuKoConfDataGetter.getStringValue(line);
                    System.out.println(object);
                }
            }
       /* } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
