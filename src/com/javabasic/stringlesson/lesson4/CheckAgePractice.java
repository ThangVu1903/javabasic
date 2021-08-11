package com.javabasic.stringlesson.lesson4;

import java.util.Scanner;

public class CheckAgePractice {
    public static void main(String[] args) {
        int check = enterAge();
        checkAge(check);
    }


    public static int enterAge(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter age : ");
        int age = scanner.nextInt();
        return age;
    }



    public static void checkAge(int age){
        if (age<0){
            System.out.println("invalid aeg !");
        }
        else {
            if (age<18){
                System.out.println("this is children");
            }
            else {
                if (age>=18 && age<=200){
                    System.out.println("this is adult");
                }
                else{
                        System.out.println("this is a monster");
                };
            };
        };
    }
}
