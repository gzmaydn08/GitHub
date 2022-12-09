package day07ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz...");

        int num = input.nextInt();

        //Example 3: verilen bir sayının pozitif negatif veya nötr olduğunu kontrol eden kodu yazın

        if (num>0){
            System.out.println("pozitif...");

        }else if (num<0){
            System.out.println("negatif...");

        }else{
            System.out.println("nötr...");
        }







    }
}