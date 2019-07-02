package com.autohome;

import java.util.Date;
import java.util.Scanner;

public class Switch2 {


    public static void main(String[] args) {

        char grade = 'C';

        Character[] wyd = {'w', 'y', 'd'};

        Character.charCount(grade);


        String name = "weiyudang";


        System.out.println(name.charAt(2));
        System.out.println(name.concat("_liming"));
        System.out.println(name.contains("we"));
        System.out.println(name.length());


        StringBuffer sbuffer = new StringBuffer("采菊东篱下");

        sbuffer.append("悠然见南山");
        sbuffer.append(1);
        sbuffer.append('c');
        sbuffer.append(12.34);


        System.out.println(sbuffer.reverse());
        System.out.println(sbuffer.delete(3, 6));
        System.out.println(sbuffer.insert(3, "weiyudang"));
        System.out.println(sbuffer.replace(1, 4, "YYY"));
        System.out.println(sbuffer.capacity());


        switch (grade) {
            case 'A':
                System.out.println("args = [" + "优秀" + "]");
                break;
            case 'C':
                System.out.println("args = [" + "良好" + "]");

                break;

            default:
                System.out.println("未知");


        }

        // 创建数组
        double[] scores = {1.2, 3.4, 5.8};


        String[] names = new String[3];
        names[0] = "魏玉党";
        for (int i = 0; i < 3; i++) {
            System.out.println(scores[i]);
        }


        for (double ele : scores) {
            System.out.println(ele);
        }
        int n = 20;
        System.out.println(new String(new char[n]).replace("\0", "weiyudang"));

        System.out.println(String.format("%0" + 10 + "d", 0));


        System.out.println("%0" + 10 + "d");


        Date date = new Date();

        System.out.printf("日期：%tc%n", date);
        System.out.printf("日期：%tF%n", date);
        System.out.printf("日期：%tD%n", date);
        System.out.printf("日期：%tr%n", date);
        System.out.printf("日期：%tT%n", date);


        printArray(scores);

        printMax(3, 1, 10, 22);


        try {
            int[] a = new int[2];
            System.out.println("Acess element thress" + a[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);


        }


        int x = 3;
        int z=(x>2)?x:1;

        Scanner sc= new Scanner(System.in);

        System.out.println("请输入信息:");


        int i=sc.nextInt();
        System.out.println("i:"+i);


    }


    public static void printArray(double[] array) {

        for (double ele : array) {
            System.out.println(ele);
        }


    }


    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}

