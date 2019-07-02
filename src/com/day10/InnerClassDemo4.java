package com.day10;

interface  Say{
    public  abstract  void show();

}

class Person2 {


    public void  method(Say s){
        s.show();
    }

}



public class InnerClassDemo4 {


    public static void main(String[] args) {

        new Person2().method(new Say() {
            @Override
            public void show() {
                System.out.println("接口的实现");
            }
        });



    }
}
