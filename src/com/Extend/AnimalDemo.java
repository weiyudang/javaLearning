package com.Extend;

class Animal {



    private  String name;
    private  int age;


    public Animal(){ }

    public Animal(String name,int age){
        this.name=name;
        this.age=age;

    }


    public void setName(String name){
        this.name=name;
    }


    public String getName(){
        return this.name;
    }


    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return  this.age;
    }
}


class Cat  extends  Animal {

    public  Cat(){}
    public   Cat(String name,int age){
        super(name,age);
    }


    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }


}

class Dog extends  Animal {
    public Dog() {}
    public Dog(String name,int age){
        super(name,age);
    }

    public void lookDoor(){
        System.out.println("狗可以看门");
    }
}



public  class AnimalDemo{


    public static void main(String[] args) {

        Cat c=new Cat("mao",12);

        c.catchMouse();
        c.setAge(200);

        Dog d=new Dog("dog",200);
        d.lookDoor();


    }

}



