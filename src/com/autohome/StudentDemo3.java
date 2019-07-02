package com.autohome;


class Student1 {

    String name;
    public static int className = 1992;


    public void showName() {
        System.out.println(this.name + className);

    }


    public static void showClassName() {

        System.out.println(className);
    }

}

public class StudentDemo3 {


    public static void main(String[] args) {


        Student1 p = new Student1();
        p.showName();
        Student1.showClassName();
        p.showClassName();


    }


}
