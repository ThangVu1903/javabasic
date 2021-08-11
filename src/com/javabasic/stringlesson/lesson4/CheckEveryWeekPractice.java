package com.javabasic.stringlesson.lesson4;

import java.util.Scanner;

public class CheckEveryWeekPractice {
    public static void main(String[] args) {
        int check = enterNumberInWeek();
        checkWeekDay(check);
    }


    public static int enterNumberInWeek(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number : ");
        int numberInWeek = scanner.nextInt();
        return numberInWeek;
    }

    public static void checkWeekDay(int numberInWeek){
        switch (numberInWeek){
            case (0) :{
                System.out.println("SUNDAY");
                break;
            }
            case (1) :{
                System.out.println("MONDAY");
                break;
            }
            case (2) :{
                System.out.println("TUESDAY");
                break;
            }
            case (4) :{
                System.out.println("WEDNESDAY");
                break;
            }
            case (5) :{
                System.out.println("THURSDAY");
                break;
            }
            case (6) :{
                System.out.println("FRIDAY");
                break;
            }
            case (7) :{
                System.out.println("SATURDAY");
                break;
            }
            default: {
                System.out.println("The number is invalid");
                break;
            }
        }
    }

}
