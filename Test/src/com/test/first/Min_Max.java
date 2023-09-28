package com.test.first;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        System.out.println("请入输入一个数组：");
        Scanner scanner = new Scanner(System.in);
       String[] nums =null;
       //定义一个字符串类型，用来接收数据，并用空格来分割数组。
       nums =scanner.nextLine().split(" ");

       int arr[]=new int[nums.length];
//       将字符串的长度当数组的长度。

        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.valueOf(nums[i]);
            /*valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。

            该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数。*/
        }

//        int arr[]={12,24,4,7,2,1,9};
        for (int i=0;i< arr.length-1;i++){
                for (int j=0;j< arr.length-1-i;j++){
                    if (arr[j]<arr[j+1]){
                        int temp = 0;
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] =temp;

                    }

                }



        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("---------------------------------------");
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;

                }

            }



        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
