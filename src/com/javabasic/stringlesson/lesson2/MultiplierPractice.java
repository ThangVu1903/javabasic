package com.javabasic.stringlesson.lesson2;

import java.util.Scanner;

public class MultiplierPractice {
    public static void main(String[] args) {
        int number=enterNumber();
        smallMultiplier(number);
    }


    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number: ");
        int number=scanner.nextInt();
        return number;
    }


    public static void smallMultiplier(int number){
        int i, integran=1;
        for (i=0;i<=10;i++){
            integran = number*i;
            System.out.println(number+"*"+i + "="+integran);
        }
    }
}
