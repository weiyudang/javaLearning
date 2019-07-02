package com.Extend;


class A1 {
    private String name;
    public  static final  int value=100;

    void show() {
        System.out.println("我是A");
    }


    final  void print(){
        System.out.println("我是A.....");
    }



}

class B1 extends A1 {


    public void show() {
        System.out.println("我是B");
    }




}

class  InstanceCounter {
    private  static  int numInstances =0;

    static  int getCount(){
        return  numInstances;
    }

    private static void addinstance(){
        numInstances++;
    }

    InstanceCounter(){
        InstanceCounter.addinstance();
    }
}


abstract   class NN{
    private double price;
    private  String model;
    private  String year;
    public abstract void  gofast();
    public abstract  void  changeColor();
}


public class ExtendDemo2 {
    public static void main(String[] args) {



        A1 a=new A1();
        a.show();
        System.out.println(a.value);



        B1 b1=new B1();
        b1.show();


        System.out.println(InstanceCounter.getCount());

        for(int i=0;i<10;i++){
            new InstanceCounter();
        }

        System.out.println(InstanceCounter.getCount());




    }

}
