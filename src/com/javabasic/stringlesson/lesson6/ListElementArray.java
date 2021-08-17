package com.javabasic.stringlesson.lesson6;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ListElementArray {
    public static void main(String[] args) {
        //bài 3 : liệt kê các phần tử trong mảng xuất hiện 1 lần
        int[] array = enterArray();
        listElement(array);

    }
     public static int[] enterArray(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the number of elements in the array : ");
         int number = scanner.nextInt();
         int[] array = new int[number];
         for (int i = 0; i < array.length; i++){
             System.out.printf("array[ %d ] =",i);
             array[i] = scanner.nextInt();

         }
         return array;
     }

     public static void listElement(int[] array){
        for (int i=0; i<array.length; i++){
            int count=0;
            for (int j=0; j<array.length;j++){
                if (array[i]==array[j] && i!=j){
                    count++;
                }
            }
            if (count==0){
                System.out.print(array[i]+" ");
            }
        }
     }
}
