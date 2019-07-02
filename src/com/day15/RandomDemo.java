package com.day15;

import java.util.ArrayList;

public class RandomDemo {


    public static void main(String[] args) {


        ArrayList<Integer>     arr=new ArrayList<Integer>();
        int count=0;
        while (count<10){
            int randomNumber=(int)(Math.random()*20)+1;
            if (!arr.contains(randomNumber)){
                arr.add(randomNumber);
                count++;
            }
        }


        System.out.println(arr);
    }
}
