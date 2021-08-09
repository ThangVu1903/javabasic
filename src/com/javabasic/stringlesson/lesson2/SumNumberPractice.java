package com.javabasic.stringlesson.lesson2;

import java.util.Scanner;

public class SumNumberPractice {
    public static void main(String[] args) {
        int sumNumber=enterNumber();
        totalNumber(sumNumber);
        System.out.println("sum number : "+sumNumber);
    }



    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number: ");
        int number=scanner.nextInt();
        return number;
    }



    public static int totalNumber(int number){
        int i, sum=0;
        for (i=1;i<=number;){
           sum=sum+i;
           i=i+1;
        }
        return sum;
    }
}
