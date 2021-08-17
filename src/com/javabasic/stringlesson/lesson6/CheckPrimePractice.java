package com.javabasic.stringlesson.lesson6;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class CheckPrimePractice {
    //bài 1 : liệt kê các số nguyên tố nhỏ hơn n
    public static void main(String[] args) {
        int number = enterNumber();
        for (int i =2 ; i < number ; i++){
            if (checkPrime(i)){
                System.out.print(i+" ");
            }
        }

    }

    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number: ");
        int number = scanner.nextInt();
        return  number;
    }


    public static boolean checkPrime(int number){
        int i, count=0;
        for (i=2;i<=Math.sqrt(number);i++){
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
}
