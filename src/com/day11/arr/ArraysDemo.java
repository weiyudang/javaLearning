package com.day11.arr;

import java.util.Arrays;

/*

Arrays:针对数组进行操作的工具类，提供类排序，查找等功能

成员方法：
    public static String toString(int[],a);把数组转成字符串；
    public static void sort(int[] a);排序
    public static int binarySearch(int[] a,int key) 二分查找


 */

public class ArraysDemo {


    public static void main(String[] args) {

        int[] arr={ 24, 13, 69, 80, 57 };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

    }
}
