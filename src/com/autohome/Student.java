package com.autohome;

public class Student {

    public  String Name;
    public  int Age;
    private  boolean Sex;

    public Student(){

    }

    public  Student(String  name,int age){
        this.Name=name;
        this.Age=age;

    }


    public  boolean  isSex(){
        return Sex;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public  void  setSex(boolean sex){
        this.Sex=sex;
    }


}










