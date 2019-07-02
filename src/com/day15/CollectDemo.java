package com.day15;

import com.autohome.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectDemo {

    public static void main(String[] args) {

        Collection c=new ArrayList();

        c.add("hello");
        c.add("world");
        c.add("java");


        System.out.println(c.contains("hello"));
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.remove("java");
        System.out.println(c);


        Collection c2 = new ArrayList();
        // c2.add("abc1");
        // c2.add("abc2");
        // c2.add("abc3");
        // c2.add("abc4");
        c2.add("hello");
        c2.add("world");
        c2.add("python");

        c.addAll(c2);

        System.out.println(c);
        System.out.println(c.containsAll(c2));
        System.out.println(c.retainAll(c2));
        System.out.println(c);
        System.out.println(c2);



        Object[] objs=c.toArray();

        for(int i=0;i<objs.length;i++){
            String s=(String) objs[i];
            System.out.println(s);
        }


        Student s1=new Student("魏玉党",20);
        Student s2=new Student("王佳琪",19);
        Student s3=new Student("秦可卿",20);

        Collection hl=new ArrayList();
        hl.add(s1);
        hl.add(s2);
        hl.add(s3);

        Object[]  objss=hl.toArray();
        for(Object ele:objss){
            Student s=(Student) ele;
            System.out.println(s.getName());

        }


        Iterator it=hl.iterator();

        while (it.hasNext()){
            Student s= (Student) it.next();
            System.out.println(s.getName());
        }


        for(Iterator it1=hl.iterator();it1.hasNext();){
            Student s= (Student) it.next();
            System.out.println(s.getName());
        }


        List list=new ArrayList();
        list.add("关羽");
        list.add("张飞");
        list.add("刘备");

        for(Iterator san=list.iterator();san.hasNext();){
            String s=(String) san.next();
            System.out.println(s);

        }










    }


}
