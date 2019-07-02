package com.autohome;


public class Test {

    public static void main(String[] args) {
        System.out.println("weiyudang");


        int a=1;
        int b=2;


        Student wyd=new Student();

        wyd.Name="weiyudang";
        wyd.Age=19;
        String isMan=wyd.isSex() ?"girl":"boy";


        Student  wjq=new Student("wangjia",12);
        System.out.println("姓名:"+wjq.Name+"年龄："+wjq.Age);

        System.out.println(wyd.Name+wyd.Age+isMan);



    }

}
