package com.day10;


class Outer {
    private   String name="呼叫外部类";
    //不让外界直接访问内部类，数据更加安全
    private  class Inner {
        private String name="wieyudang";
        public void show() {
            System.out.println("内部类"+this.name);
            System.out.println(Outer.this.name);
        }
    }


    public  void  method(){
        Inner i =new Inner();
        i.show();
    }
}
public class InnerClassDemo {


    public static void main(String[] args) {
//        Outer.Inner i = new Outer().new Inner();
        Outer i = new Outer();
        i.method();
    }
}
