package com.Abstract;

abstract  class Animal {

    String series="动物";
    final int num2=20;
    public abstract  void eat();

    public void show(){
        System.out.println("我是动物");
    }


}

abstract  class Dog extends  Animal{

}

class Cat extends  Animal{
    public void eat(){
        System.out.println("猫吃猫粮");
    }

}

public class AbstractDemo {


    public static void main(String[] args) {
        Animal cc=new Cat();
        cc.eat();
        cc.show();
        System.out.println(cc.series);

    }



}
