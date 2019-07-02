package com.day11;

import java.util.Scanner;

public class ScannerDemo {


    public static void main(String[] args) {


        Scanner   sc  = new Scanner(System.in);

        for(int i=0;i<2;i++) {
            int randomNum=(int)(Math.random()*100);
            System.out.println("请你输入(1-100)的数字:");
            int input_num=sc.nextInt();
            System.out.printf("%d-%d=%d%n",randomNum,input_num,randomNum-input_num);
        }



        if (sc.hasNextInt()){
            int number =sc.nextInt();
            System.out.println(number);
        }




        String s=sc.nextLine();


        System.out.println(s);

        System.out.println("over");

    }
}
