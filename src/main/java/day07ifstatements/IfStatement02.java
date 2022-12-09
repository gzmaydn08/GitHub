package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz...");

        int num  = input.nextInt();

        //1.yol
        if(num%2==0){
            System.out.println("çift sayı...");

        }

        if(num%2!=0){
            System.out.println("tek sayı...");

        }



        //2.yol
        if(num%2==0){
            System.out.println("çift sayı...");

        }else {
            System.out.println("tek sayı...");
        }


    }
}
