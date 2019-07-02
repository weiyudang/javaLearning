package com.Extend;


class Animal1 {
    public void eat() {
        System.out.println("动物吃饭");
    }


}

class Dog1 extends Animal1 {
    public void eat() {
        System.out.println("狗吃肉");
    }
}

public class DuoTaiDemo {


    public static void main(String[] args) {

        Animal1 a = new Animal1();
        Dog1 b = new Dog1();
//        Dog  c= new Animal();
        showEat(a);
        showEat(b);

    }

    public  static  void showEat(Animal1 cc){
        cc.eat();
    }
}
