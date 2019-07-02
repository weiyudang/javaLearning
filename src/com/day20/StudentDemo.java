package com.day20;

public class StudentDemo {



    public static void main(String[] args) {

        Student s=new Student();

        s.study();

        Student a=getSt();
        s.study();



    }

    public static  Student getSt(){
        return  new Student();
    }
}
