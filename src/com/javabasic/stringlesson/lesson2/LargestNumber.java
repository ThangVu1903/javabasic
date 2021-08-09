package com.javabasic.stringlesson.lesson2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int numberFirst, numberLast;
        numberFirst= enterFirstNumber();
        numberLast = enterLastNumber();
        int great = maxNumber(numberFirst,numberLast);
        System.out.println("the largest number is: "+great);


    }
    public static int enterFirstNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number one :");
        int numberOne = scanner.nextInt();
        return numberOne;
    }
    public static int enterLastNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number two:");
        int numberTwo = scanner.nextInt();
        return numberTwo;
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
