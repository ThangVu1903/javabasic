package com.javabasic.stringlesson.lesson6;

import java.util.Scanner;

public class AnalyzieIntoPrime {
    //phân tích thành thứa số nguyên tố
    public static void main(String[] args) {
        int number=enterNumber();
        analyzing(number);
    }
    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number :");
        int number = scanner.nextInt();
        return number;
    }

    public static void analyzing(int number){
        if (number<2){
            System.out.println("Invalid value");
        }
        for (int i=2;i<=number;i++){
            while (number%i==0){
                number=number/i;
                if (number==1){
                    System.out.print(i);
                }
                else {
                    System.out.print(i+"*");
                }
            }
        }
    }
}
