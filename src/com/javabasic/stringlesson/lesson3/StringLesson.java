package com.javabasic.stringlesson.lesson3;

public class StringLesson {
    public static void main(String[] args) {
        String strExample = "Toi yeu Da Nang";

        // Bài 1: Tìm vị trí kí tự a
        System.out.println( "vị trí kí tự a thứ nhất trong chuỗi : " + strExample.indexOf("a")
                            + "\nvị trí kí tự a thứ hai trong chuỗi :"  + strExample.lastIndexOf("a"));

        // Bài 2: tách chuỗi thành 4 từ riêng biệt
        System.out.println("Tách chuỗi thành 4 từ riêng biệt là :\n" + strExample.substring(0,3)
                                                                    + "\n"+strExample.substring(4,7)
                                                                    + "\n"+strExample.substring(8,10)
                                                                    + "\n"+strExample.substring(11,15));
        
        // Bài 3: nối 4 từ trên thành Toi yeu Da Nang
        String strExample_1 = "Toi";
        strExample_1 = strExample_1.concat(" yeu").concat(" Da").concat(" Nang");
        System.out.println("Nối 4 từ thành chuỗi:  " +strExample_1);

        // Bài 4 : lấy chuỗi "DaNang" trong chuỗi "Toi yeu Da Nang":

        String strExample_2 = strExample.substring(8,10) + strExample.substring(11,15);

        System.out.println("lấy chuỗi DaNang : " +strExample_2);

        // Bài 5 : Đổi "Toi yeu Da Nang" thành "Toi yeu Ha Noi"
        String strExample_3=strExample.replace("Da Nang","Ha Noi");
        System.out.println("Thay đổi chuỗi : "+strExample_3);
 
        // Bài 6: kiểm tra một chuỗi có rỗng không
        String strExample_4 = "";
        String strExample_5 = "abcd";
        System.out.println(strExample_4.isEmpty());
        System.out.println(strExample_5.isEmpty());

    }
}