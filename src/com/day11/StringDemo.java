package com.day11;

public class StringDemo {


    public static void main(String[] args) {


        String s1= new String();

        System.out.println(s1.length());


        byte[]  bytes={93,23,21,45,64};

        String s2=new String(bytes);
        System.out.println(s2.length());


        char[]  chs={'1','a','c'};

        String s4=new String(chs);
        System.out.println(s4.length());


        String s5=new String("weiyudang");
        System.out.println(s5.length());
        System.out.println(s5.replace("w","W"));
        System.out.println(s5.contains("we"));
        System.out.println(s5.concat("_中国人民大学硕士研究生"));
        System.out.println(s5.charAt(3));
        System.out.println(s5.indexOf("yu"));
        s5+="_王佳琪";
        System.out.println(s5);


        String s6="hello";
        String s7=new String("hello");
        System.out.println(s6==s7);
        System.out.println(s6.equals(s7));
        System.out.println(s6.substring(2,5));
        System.out.println(s6.getBytes());
        System.out.println(s6.toCharArray());
        System.out.println(String.valueOf(new char[]{'1'}));
        String bb=  "       weiyudang     ";

        System.out.println(bb.trim());

     }
}
