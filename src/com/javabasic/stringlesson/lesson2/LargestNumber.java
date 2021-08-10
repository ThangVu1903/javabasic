package com.javabasic.stringlesson.lesson2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int numberFirst= enterNumber();
        int numberLast = enterNumber();
        int great = maxNumber(numberFirst,numberLast);
        System.out.println("the largest number is: "+great);


    }


    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number :");
        int number = scanner.nextInt();
        return number;
    }


    public static int maxNumber(int numberOne, int numberTwo){
        int bigger;
        if (numberOne>numberTwo){
             bigger = numberOne;
        }
        else {
            bigger = numberTwo;
        };

        return bigger;
    }
}
