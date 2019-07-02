package com.day10;


class Outer2 {
    private  int num=1;

    public  void method() {
    final  int inner_num=1010;

    class Inner {
        public void show(){
            System.out.println(inner_num);
        }



    }


    Inner c= new Inner();
    c.show();
    }
}
public class InnerClassDemo2 {


    public static void main(String[] args) {

        Outer2 o=new Outer2();
        o.method();
        System.out.println(o.hashCode());
        System.out.println(o.toString());
        System.out.println(o.getClass());
        System.out.println(o.getClass().getAnnotatedSuperclass());


    }
}
