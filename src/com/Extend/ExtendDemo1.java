package com.Extend;



class Fu{
    static {
        System.out.println("静态代码Fu");
    }


    {
        System.out.println("构造代码块Fu");
    }

    public Fu() {
        System.out.println("构造方法Fu");
    }

}


class  Zi extends  Fu  {
    static {
        System.out.println("静态代码zi");
    }


    {
        System.out.println("构造代码块zi");
    }

    public Zi() {
        System.out.println("构造方法zi");
    }
}
public class ExtendDemo1 {

    public static void main(String[] args) {


        Zi z=new Zi();
//        Zi z1=new Zi();

    }


}
