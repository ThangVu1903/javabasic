package com.javabasic.stringlesson.lesson4;

import java.util.Scanner;

public class CheckEveryMonthPractice {
    public static void main(String[] args) {
        int check=enterNumberMonthOfYear();
        checkMonth(check);
    }



    public static int enterNumberMonthOfYear(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number : ");
        int numberMonth = scanner.nextInt();
        return numberMonth;
    }



    public static void checkMonth(int numberMonth){
        switch (numberMonth){
            case (2):{
                System.out.println("this month has 28 days");
                break;
            }
            case (4):
            case (6):
            case (9):
            case(11):{
                System.out.println("These months have 30 days");
                break;
            }
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case(12):{
                System.out.println("These months have 31 days");
                break;
            }
            default:{
                System.out.println("The number is invalid");
            }

        }
    }
}
