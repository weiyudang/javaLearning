package com.day18;

import java.io.Serializable;
import java.util.*;

public class collectsDemo {


    public static void main(String[] args) {

        ArrayList   arr=new ArrayList();

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入随机产生的数字：");

        int counts=sc.nextInt();


        for(int i=0;i<counts;i++){
            int randomNumber=(int)(Math.random()*100);

            arr.add(randomNumber);
        }


        Collections.shuffle(arr);
        // Collections 是个工具类
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(Collections.binarySearch(arr,2));
        System.out.println(Collections.max(arr));



        Person  p1=new Person(10);
        Person  p2=new Person(20);
        Person  p3=new Person(18);

        ArrayList<Person>  array=new ArrayList<Person>();

        array.add(p1);
        array.add(p2);
        array.add(p3);

        Collections.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.age-o1.age;
            }
        });

        System.out.println(array);


        for(Person p:array){
            System.out.println(p.age);
        }

        System.out.println(p1.compareTo(p2));









    }
}




class Person  implements Comparable<Person> , Serializable {
    public int age;



    Person(int age){
        this.age=age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}
