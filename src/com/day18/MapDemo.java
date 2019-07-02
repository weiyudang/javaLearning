package com.day18;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {


        Map m1= new HashMap();
        m1.put("wyd",19);
        m1.put("wjq",20);
        m1.put("abc",70);

        System.out.println(m1);
        System.out.println(m1.containsKey("wyd"));


        Set<String>  set=new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("1");

        System.out.println(set);



        HashSet<String>  hs=new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");

        System.out.println(hs);

        TreeSet<Integer>  ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(11);
        ts.add(20);
        ts.add(9);

        System.out.println(ts);



        Integer[]  intArr ={1,2,10,8};
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };


        printArray(intArr);
        printArray(doubleArray);
        printArray(charArray);







    }


    public  static < E > void printArray(E[] arr){
        for(E ele:arr){
            System.out.println(ele);
        }
    }
}
