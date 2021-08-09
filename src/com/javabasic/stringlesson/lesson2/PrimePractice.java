package com.javabasic.stringlesson.lesson2;

import java.util.Scanner;

public class PrimePractice {
    public static void main(String[] args) {
        int check = enterNumber();
        checkPrime(check);
    }


    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number: ");
        int number=scanner.nextInt();
        return number;
    }


    public static void checkPrime(int number){
        int i, count=0;
        for (i=1;i<=number;i++){
            if (number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("This is a prime number");
        }
        else {
            System.out.println("This is not a prime number");
        }
    }
}
