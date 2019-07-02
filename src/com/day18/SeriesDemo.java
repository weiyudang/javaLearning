package com.day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeriesDemo {


    public static void main(String[] args) {
        Person p1=new Person(12);

        try{
            FileOutputStream fileOut=
                    new FileOutputStream("p1.ser");

            ObjectOutputStream out=new ObjectOutputStream(fileOut);
            out.writeObject(p1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved");
        } catch(IOException i){
        i.printStackTrace();
    }

    }
}








