package com.day15;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        String result = reverse(s);
        System.out.println(result);


    }


    public static String reverse(String s) {
        String result = "";

        char[] chs = s.toCharArray();

        for (int x = chs.length - 1; x >= 0; x--) {
            result += chs[x];
        }
        return   result;
    }


}
