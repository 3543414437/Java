package com.test.first;
import java.util.Scanner;


public class P0922{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        double[] nums = new double[2];
       double nums_1 =nums[0] = scanner.nextDouble();
        System.out.print("请输入第二个数字");
        double nums_2 =nums[1] = scanner.nextDouble();
        double i=adds(nums_1,nums_2);

        System.out.print(i);
    }
    public  static   double adds(double a, double b){
        double c= a +b;
        return c;
    }
    public  static   double minus(double a, double b){
        double c= a -b;
        return c;
    }
}