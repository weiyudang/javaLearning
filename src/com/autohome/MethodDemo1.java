package com.autohome;

public class MethodDemo1 {
/*

 */

    public static void main(String[] args) {

        double a=10.0;
        double b=20.1;

        System.out.println(Sum(a,b));
        System.out.println(Sum(a,b,200.1));




        Phone  p=new Phone("apple1",200);
        p.brand="apple";
        p.color="red";
        p.price=20;
        System.out.println(Phone.uid);

        p.call("魏玉党");


    }


    /**
     *
     * @param a  第一个数字
     * @param b  第二个数字
     * @return   结果
     */
    public static double  Sum(double a,double b){
        return  a+b;
    }


    public static double  Sum(double a,double b,double c){
        return  a+b+c;
    }





}

/*
  成员变量：其实就是一个变量，只不过定义在类中方法外，并且也不给初始化值。
  成员方法：其实就是一个方法，只不过不需static
 */

/**
 * @author  weiyudang
 *
 */
class Phone {

    String brand;  //成员变量
    int price;
    String color;


    public  static   int uid=1992;  // 类变量

    Phone(){

    }

    /**
     *
     * @param brand  手机的品牌
     * @param price  手机的价格
     */
    Phone (String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    @Deprecated
    public  void  call(String  name){ //成员方法
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(){
        System.out.println("群发信息");
    }
}

/*
class Phone(object):
    uid=1992

    def __init__(self,brand,price,color):
        self.brand=brand
        self.price=price
        self.color=color

    def call(name):
        print('')

    def sendMessage():
        print("群发信息")
 */