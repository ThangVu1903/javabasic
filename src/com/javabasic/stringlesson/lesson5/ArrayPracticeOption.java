package com.javabasic.stringlesson.lesson5;

public class ArrayPracticeOption {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0]=4;
        array[1]=7;
        array[2]=8;
        array[3]=5;
        array[4]=19;
        array[5]=11;
    printArray(array);
    insertArray(array);
    }
    public static void printArray(int[] array){
        System.out.println("given array: ");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + "  ");
        }
    }
    public static void insertArray(int[] array){
        int length = array.length;
        array[2]=100;
        for (int i=length;i>=0;i--){
           array[i]=array[i-1];
            System.out.println(array[i]);
        }
    }
}
