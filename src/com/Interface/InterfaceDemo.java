package com.Interface;

interface  Animal {
    public static  final  int num=20;

    public abstract void  show();
}

class Dog implements  Animal {
    public void  show(){
        System.out.println("我是狗");
    }
}



interface  A {}
interface  B {}


class C{}
class D extends  C implements A,B{

}
interface  E extends  A,B {

}

public class InterfaceDemo {

    public static void main(String[] args) {
        Dog  d=new Dog();
        d.show();
  }
}



