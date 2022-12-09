package day03scanner;

import java.util.Scanner;

public class Scanner01 {


    //kulllanıcıdan data alıp kodlarımızda kullanacağız.

    public static void main(String[] args) {

        // 1. adım scanner classta obje oluştur.
        Scanner input = new Scanner(System.in);

        //2. adım kullanıcıya ne istediğinize dair mesaj veriniz.
        System.out.println("lutfen yaşinizi giriniz...");

        //3. adım uygun methodu kullanarak kullanıcının verdiği datayı memorye yerleştiriniz.
       byte age = input.nextByte();
        System.out.println(age);

    }






}
