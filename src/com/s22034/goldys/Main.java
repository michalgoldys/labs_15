package com.s22034.goldys;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        //task3();
        //task4();
    }

    public static void task1(){

        String str = "Lisbona (Lisbon, Portugal), " +
                "Warszawa (Warsaw, Poland), and " +
                "Roma (Rome, Italy)";

        String pat = "\\((\\p{L}+)\\s*,\\s*(\\p{L}+)\\)";

        Matcher m = Pattern.compile(pat).matcher(str);

        while(m.find()){
            System.out.println(
                    m.group(2) + "->" + m.group(1) + "->" + m.group(3)
            );
        }
    }

    public static void task2(){

        String text = null;

        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\FirstLast.txt");
            byte[] bytes =
                    fileInputStream.readAllBytes();
            text = new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e){
            System.out.println("Problems..");
            System.exit(1);
        }
        String regx = "(\\p{L}+),";
        Matcher m = Pattern.compile(regx).matcher(text);

        while (m.find()){
            System.out.println(
                    m.group(1)
            );
        }
    }

    public static void task3(){

        String text = "good 2-01-2020 abc \nwrong " +
                "4/7-2010\ngood 11/11/2011 " +
                "wrong 211/3/1998 jkl\n" +
                "good 13.9.1999 wrong 1.1.20121\n" +
                "good 11.05.1823, wrong 9_10_2000";

        System.out.println("*** Before\n" + text);

        String r;
        String s;

        System.out.println("\n*** After\n" + text);
    }

    public static void task4(){
        /*

         */
    }
}
