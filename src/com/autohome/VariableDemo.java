package com.autohome;






public class VariableDemo {



    int Age;


    public static void main(String[] args) {

        int y=0;
        System.out.println(y);
        VariableDemo  vd=new VariableDemo();
        System.out.println(vd.Age);



        Person wyd=new Person();
        wyd.love();

//        匿名对象

        new Person().love();
    }
}



class Person {
    public void love(){
        System.out.println("学生喜欢放假");

    }

}
