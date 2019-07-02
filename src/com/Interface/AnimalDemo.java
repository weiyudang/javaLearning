package com.Interface;


interface   Sport {
    public  abstract  void  jump();
}


abstract  class Animal3 {


    private  String name;
    private  int age ;

    public  Animal3(){};

    public Animal3(String name,int age) {
        this.name = name;
        this.age=age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public  void  sleep(){
        System.out.println("动物要睡觉");
    }

    public  abstract  void eat();
}



class Cat extends  Animal3 {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name,age);
    }


    public  void  eat(){
        System.out.println("猫吃猫粮");
    }
}


class JumpCat extends Cat implements  Sport {
    public JumpCat() {
    }

    public JumpCat(String name, int age) {
        super(name, age);
    }

    public void jump(){
        System.out.println("这只猫会跳高");
    }
}


public class AnimalDemo {


    public static void main(String[] args) {



        Cat c =new Cat();

        c.eat();


        JumpCat  jc=new JumpCat();
        jc.jump();
    }
}
