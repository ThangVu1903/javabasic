package com.javabasic.stringlesson.lesson6;

import java.util.Scanner;

public class ListFibonaciPrime {
    //in n sô ngto và fibo đầu tiên
    public static void main(String[] args) {
        int number = enterNumber();
        System.out.println(" The first " + number + " prime number are: ");
        countPrime(number);
        System.out.println("\nThe first " + number + " fibonacci number are:") ;
        countFibonaci(number);


    }
    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number :");
        int number = scanner.nextInt();
        return number;
    }

    public static boolean checkPrime(int number){
        int count=0;
        for (int i=2;i<=Math.sqrt(number);i++){
            if (number%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void countFibonaci(int number){
        int numberOne=0, numberTwo=1, sum;
        for (int i=1;i<=number;i++){
            sum = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = sum;
            System.out.printf(" %d ", sum);
        }
    }

    public static void countPrime(int number){
        int count=0,i=2;
        while(count<number){
            if (checkPrime(i)){
                System.out.printf(" %d ",i);
                count++;
            }
            i++;
        }
    }
}
