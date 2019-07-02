package com.day11;

import sun.util.resources.cldr.ga.CurrencyNames_ga;

import java.math.BigInteger;

public class CharDemo {


    public static void main(String[] args) {




        Character ch=new Character('a');
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetter('b'));
        System.out.println(Character.toUpperCase('c'));


        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.max(20,30));
        System.out.println(Long.max(10,20));

        System.out.println(Double.sum(10.3,20.3));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toString(10,20));

        Integer x=20;
        Integer  c=Integer.valueOf(20);

        x+=30;
        System.out.println(x.getClass());


        BigInteger  bi=new BigInteger("12342222221");
        System.out.println(bi);
        BigInteger  bi1=new BigInteger("232");
        System.out.println(bi.add(bi1));
        System.out.println(bi.multiply(bi1));








    }
}
