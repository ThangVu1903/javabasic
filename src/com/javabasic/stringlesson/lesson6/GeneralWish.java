package com.javabasic.stringlesson.lesson6;

import java.util.Scanner;

public class GeneralWish {
    public static void main(String[] args) {
        //bài 2 :tìm ucln
        System.out.println("enter number 1 : ");
        int number1= enterNumber();
        System.out.println("enter number 2 : ");
        int number2= enterNumber();
        int max = generalWishMax(number1, number2);
        System.out.println("The largest common estimate is: "+max);


    }
    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }


    public static int generalWishMax(int number1, int number2){
        while (number1 != number2){
           if (number1 > number2){
               number1 = number1-number2;
           }
           else {
               number2 = number2 - number1;
           }
        }
        return number1;
    }
}
