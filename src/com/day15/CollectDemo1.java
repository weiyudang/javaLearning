package com.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectDemo1 {


    public static void main(String[] args) {


        List list = new ArrayList();
        list.add("关羽");
        list.add("张飞");
        list.add("刘备");

        for (Iterator san = list.iterator(); san.hasNext(); ) {
            String s = (String) san.next();

            System.out.println(s);
        }

        list.add(3,"曹操");

        System.out.println(list.get(2));
        list.set(1,"貂蝉");
        System.out.println(list);



        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            System.out.println(list.get(i).getClass());
        }


        ListIterator lit=list.listIterator();

        while (lit.hasNext()){
            String s=(String) lit.next();
            if("关羽".equals(s)){
                lit.add("傻叉");
            }
        }

        System.out.println(list);

    }
}
