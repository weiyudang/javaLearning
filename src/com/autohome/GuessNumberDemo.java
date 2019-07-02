package com.autohome;

import java.util.Scanner;

public class GuessNumberDemo {
    public static void main(String[] args) {

        int numbers= (int)(Math.random()*100);

        System.out.println(numbers);

        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一个数据:(1-100)");

            int guessNumber =sc.nextInt();

            if(guessNumber>numbers){
                System.out.println("大啦");
            }else if (guessNumber<numbers){
                System.out.println("小啦");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
