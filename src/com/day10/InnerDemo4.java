package com.day10;


interface  Inter1{
    public  abstract  void show();
    public  abstract  void show2();

}



class Outer3{

    private int num=10101;

    public  void  show(){


        new Inter1(){
            public void show(){
                System.out.println("我是内部类");
            }

            @Override
            public void show2() {
                System.out.println("我是内部类的show");
            }
        }.show();
    }

}
public class InnerDemo4 {


    public static void main(String[] args) {


        Outer3 o = new Outer3();
        o.show();
    }
}
