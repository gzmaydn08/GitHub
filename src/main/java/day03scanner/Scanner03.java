package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        // kullanıcıdan adresini alınız ve ekrana yazdırınız.

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen adresinizi giriniz...");

        //nextLine() methodu "çok kelimeli String" almak için kullanılır.
        // next() tek kelimelik.
        String adress = input.nextLine();
        System.out.println(adress);






    }
}
