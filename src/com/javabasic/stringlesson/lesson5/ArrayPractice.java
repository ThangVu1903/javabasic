package com.javabasic.stringlesson.lesson5;

public class ArrayPractice {
    public static void main(String[] args) {
    int[] arr = new int[]{3, 15, 2, 7, 9, 1, 6, 12, 19, 10};
    increase(arr);
    int max = maxArr(arr);
    System.out.println("\nnumber max: "+max);
    int min = minArr(arr);
    System.out.println("\nnumber min: "+min);
    selectArray(arr);
    }





    public static void increase(int[] array){
        System.out.println("Array elements have been increased 1");
        for (int i=0;i<array.length;i++){
            array[i]=array[i]+1;
            System.out.print(array[i]+"  ");
        }
    }


    public static int maxArr(int[] array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                 max = array[i];
            }
        }
        return max ;
    }


    public static int minArr(int[] array){
        int min = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min ;
    }


    public static void selectArray(int[] array){
        int count=0;
        for (int i=0;i<array.length;i++ ){
            if (array[i]==10) {
                System.out.println("Location Element Element = 10 is: "+i);
            }
            else {
                 count++;
            }
        }
        if (count==array.length-1)  {
            System.out.println("not found");
        }

    }
}
