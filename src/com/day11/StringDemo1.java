package com.day11;

public class StringDemo1 {

    public static void main(String[] args) {

        String   maxString="woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";

        String  minString="java";


        int cnt=getCount(maxString,minString);
        System.out.println(cnt);


        String bb="weiyudang";
        System.out.println(bb.indexOf("F"));



    }


    public static  int getCount(String maxString,String minString){
        int count=0;
        int index=maxString.indexOf(minString);
        while(index!=-1){
            count++;
            maxString=maxString.substring(index+minString.length());
            index=maxString.indexOf(minString);

        }

        return   count;

    }


}
