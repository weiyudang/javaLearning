package com.day15;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class CollectDemo2 {

    public static void main(String[] args) {


        ArrayList  arr=new ArrayList();
        arr.add("关羽");
        arr.add("张飞");
        arr.add("刘备");
//
//        for(Object ele: arr){
//            String s=(String) ele;
//            System.out.println(s);
//        }


        Vector v=new Vector();

        v.addElement("ab1");
        v.addElement("ab2");
        v.addElement("ab3");

        System.out.println(v.elementAt(1));

        Enumeration en=v.elements();
        while (en.hasMoreElements()){
            String s=(String) en.nextElement();
            System.out.println(s);
        }


        LinkedList    link=new LinkedList();
        link.add("hello");
        link.add("hello1");
        link.add("hello2");

        System.out.println(link.getFirst());
        System.out.println(link.getLast());









    }
}
