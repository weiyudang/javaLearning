package com.py4jDemo;




class Person {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int sum(int a,int b){
        return a+b;
    }

}

public class Demo {


    public static void main(String[] args) {


        Person p1=new Person();

        System.out.println(p1.sum(2,3));


    }




}
