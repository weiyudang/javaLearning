package com.day11.arr;

public class ArrDemo {


    public static void main(String[] args) {


//        int []  arr={ 24, 69, 80, 57, 13 };
        int[] arr = { 13, 24, 57, 69, 80 };


//        bubbleSort(arr);
//        selectSort(arr);
//        printArray(arr);

        System.out.println(getIndex(arr,70));




    }





    public static  void printArray(int[] arr){

        StringBuffer  s=new StringBuffer();

        for(int ele:arr){
            s.append(ele);
            s.append(" ");
        }
        System.out.println(s);

    }

    /**
     * 冒泡算法 相邻两两比较，大的往后放，第一轮比较后最大的排在后面。
     * @param arr  数组
     */
    public static void bubbleSort(int[] arr){ // 传入的是对象

        for(int j =0;j<arr.length-1;j++) { // 控制比较的次数 只需要比较n-1轮

            for (int i = 0; i < arr.length - 1-j; i++) {

                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }


            }
            System.out.printf("第%d轮:",j);
            printArray(arr);
        }



    }

    /**
     * 选择排序 从索引0开始,依次跟后面的比较，小的往前面放
     * @param arr  数组
     */
    public  static void selectSort(int [] arr){
        for(int i=0;i<=arr.length-1;i++){

            for( int j=i+1;j<=arr.length-1;j++){

                if(arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }



            }
            printArray(arr);
        }
    }

    /**
     * 二分查找  折半查找
     * @param arr
     * @param value
     * @return
     */
    public   static  int getIndex(int [] arr,int value){


        int minIndex=0;
        int maxIndex=arr.length;
        int middleIndex=(maxIndex+minIndex)/2;

        while (value!=arr[middleIndex]){
            if(value>arr[middleIndex]){
                minIndex=middleIndex+1;
            }else{
                maxIndex=middleIndex-1;
            }

            if(maxIndex<minIndex){  // 不存在的情况下会出现异常情况
                return -1;
            }

            middleIndex=(minIndex+maxIndex)/2;
        }

        return middleIndex;
    }

}
