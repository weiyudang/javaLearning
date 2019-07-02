package com.day10;



public class ArgsDemo {

    public static  void main(String[] args){
        Demo d=new Demo();

        int x=10;
        int y=20;
        System.out.println(d.sum(x,y));
        Student   s= new Student();

        d.showTask(s);





    }
}


class Student {

    public void  study(){
        System.out.println("学习的主要任务是学习");
    }
}


class Demo {
    public  int sum(int a,int b ) {
        return a+b;
    }


    public  void  showTask(Student s) {
        s.study();
    }

}




