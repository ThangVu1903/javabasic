package com.javabasic.stringlesson.lesson5;

import java.util.Scanner;

public class IntoArray {
    public static void main(String[] args) {
        int numberArray = enterNumber();
       int[] replacementArray = enterArray(numberArray);
       printArray(replacementArray);
       int sum = sumArray(replacementArray,numberArray);
        System.out.println("\nThe total head and the end are: "+sum);
        printEven(replacementArray);
    }


    public static int enterNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int numberArray =scanner.nextInt();
        return numberArray;
    }


    public static int[] enterArray(int numberArray){
        Scanner scanner=new Scanner(System.in);
        int[] array = new int[numberArray] ;
        for(int i=0;i<numberArray;i++){
            System.out.printf("array[%d]= ",i);
            array[i]=scanner.nextInt();
        }
        return array;
    }


    public static void printArray(int[] array){
        for(int i=0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
    }



    public static int sumArray(int[] array,int numberArray) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[0] + array[numberArray - 1];
        }
        return sum;
    }

    public static void printEven(int[] array){
        System.out.println("The even number in the array : ");
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
    }

}

