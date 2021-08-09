package com.javabasic.stringlesson.lesson2;

import java.util.Scanner;

public class ParityPractice {
    public static void main(String[] args) {
        int number = inputNumber();
        oddEven(number);
    }
    public static int inputNumber(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter number: ");
        int number= scaner.nextInt();
        return number;
    }
    public static void oddEven(int number){
        if (number%2==0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is odd number");
        };
    }

}
