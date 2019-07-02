package com.day15;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class GetMaxNumber {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        boolean  flag= true;
        ArrayList<Integer>  arr=new ArrayList<Integer>();

        while(flag) {
            System.out.println("请输入下个数字:");
            int inputNum=sc.nextInt();
            if(inputNum!=0){
                arr.add(inputNum);

            }
            else{
                flag= false;
            }

        }


        Collections.sort(arr);
        System.out.println(arr.toString());

    }
}
