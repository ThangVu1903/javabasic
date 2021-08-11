package com.javabasic.stringlesson.lesson4;

public class MultiplierFullPractice {
    public static void main(String[] args) {
        multiplicationTable();
    }


    public static void multiplicationTable(){
        int i, j, value;
        for (i=1;i<=10;i++){
            for (j=1;j<=10;j++){
                value = i * j ;
                System.out.printf("%2d * %2d = %2d     ", i, j, value);
            }
            System.out.println();
        }
    }
}
