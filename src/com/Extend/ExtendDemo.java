package com.Extend;

class A {




    String name = "A";

    private int age;


    A(){

    }

    A(String name){
        this.name=name;
    }

    public void show() {
        System.out.println("我是A");
    }

}

class B extends A {

    public void show(){
        System.out.println("我是B");
        super.show();
    }


}

class C extends B {



}

public class ExtendDemo {


    public static void main(String[] args) {


        C cc = new C();
        cc.show();

        A aa = new A();
        System.out.println(cc.name);
//        System.out.println(cc.age);

        B bb1=new B();
        bb1.show();


    }
}
