package com.test.first;
import java.util.Scanner;


//给所有法则定义方法and方法重载
public class Calculator {
    // 加法
  /*  public static int addition(int a, int b) {
        return a + b;
    }
    public static int addition(int a, int b,int c) {
        return a + b + c;
    }*/

    // 乘法
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int multiplication(int a, int b,int c) {
        return a * b * c;
    }

    // 除法
    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("除数不能为0");

        }
    }
    public int division(int a, int b,int c) {
        if (b != 0) {
            return a / b / c;
        } else {
            throw new IllegalArgumentException("除数不能为0");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];


        System.out.println("请输入两个或三个数字：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
// 加法
        P0922_2 p0922_2 = new P0922_2();
if (numbers.length<2||numbers.length>3){
    System.out.println("输入错误");
}else if (numbers.length==2) {
    int sum = AnotherClass.addition(numbers[0], numbers[1]);
    System.out.println("加法结果：" + sum);

    // 减法
    AnotherClass anotherClass = new AnotherClass();
    int difference = anotherClass.subtraction(numbers[0], numbers[1]);

    System.out.println("减法结果：" + difference);

    // 乘法
    int product = multiplication(numbers[0], numbers[1]);
    System.out.println("乘法结果：" + product);

    // 除法
    Calculator calculator = new Calculator();
    try {
        int quotient = calculator.division(numbers[0], numbers[1]);
        System.out.println("除法结果：" + quotient);

    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
} else if (numbers.length==3) {
    int sum = AnotherClass.addition(numbers[0], numbers[1],numbers[2]);
    System.out.println("加法结果：" + sum);

    // 减法
    AnotherClass anotherClass = new AnotherClass();
    int difference = anotherClass.subtraction(numbers[0], numbers[1],numbers[2]);

    System.out.println("减法结果：" + difference);

    // 乘法
    int product = multiplication(numbers[0], numbers[1],numbers[2]);
    System.out.println("乘法结果：" + product);

    // 除法
    Calculator calculator = new Calculator();
    try {
        int quotient = calculator.division(numbers[0], numbers[1],numbers[2]);
        System.out.println("除法结果：" + quotient);

    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}

}


    }






