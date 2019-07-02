package com.day11;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateDemo {


    public static void main(String[] args) {


        Date d=new Date();

        System.out.println(d);


        try{
            Thread.sleep(1200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        long time=System.currentTimeMillis();
        Date d2=new Date(time);

        System.out.println(d2);


        Date d3=new Date(3600000);
        System.out.println(d3);

        Date d4=new Date();
        d4.setTime(30021021);

        System.out.println(d4);
        System.out.println(time);


//        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:sss");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:sss");
        System.out.println(sdf.format(d));


        String s = "2008-08-08 12:23:34";

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition cc=new ParsePosition(0);
        Date d8=sdf2.parse(s,cc);
        System.out.println(d8);


        Calendar now=Calendar.getInstance();
        int year=now.getWeekYear();
        System.out.println(now.getWeeksInWeekYear());
        System.out.println(now.YEAR+now.MONDAY+now.DATE+now.HOUR);
        System.out.println(now.MONDAY);

        System.gc();
        System.out.println(System.getenv("TMPDIR"));


        String phone="18811112222";



        System.exit(1);











    }
}
