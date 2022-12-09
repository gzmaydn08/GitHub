package day07ifstatements;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

        //Example1= gün sayısını verdiğinizde gün ismini yazan kodu giriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kaçıncı gün olduğunu giriniz...");

        byte num = input.nextByte();

        if (num==1){
            System.out.println("sunday");
        }else if (num==2){
            System.out.println("monday");
        }else  if (num==3){
            System.out.println("tuesday");
        }else if(num==4){
            System.out.println("wednesday");
        }else if(num==5){
            System.out.println("thursday");
        }else if(num==6){
            System.out.println("friday");
        }else if(num==7){
            System.out.println("saturday");
        }else {
            System.out.println("hatalı giriş yaptınız. Lütfen 1 ile 7 arasında bir sayı giriniz....");
        }




    }
}
