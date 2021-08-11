package com.javabasic.stringlesson.lesson4;

import java.util.Scanner;

public class ListPrimeNumbersPractice {
    public static void main(String[] args) {
        int number = enterNumber();
        listPrime(number);
    }


    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number: ");
        int number=scanner.nextInt();
        return number;
    }


    public static void listPrime(int number){
        int i, j, count=0;
        for (i=1;i<number;i++){
            for (j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            };
            if ( count==2){
                System.out.println(i);
            };
        };
    }
}
