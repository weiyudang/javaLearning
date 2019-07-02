package com.day10;

interface  Person {
    public abstract void study();
}


class Student1 implements  Person {
    public void study(){
        System.out.println("好好学习，天天学习");
    }
}

class PersonDemo {
    public Person  getPerson() {
        return  new Student1();
    }
}


public class ReturnDemo {
    public static void main(String[] args) {
        new PersonDemo().getPerson().study();
    }



}
