package day03scanner;

import java.util.Scanner;

public class Scanner03Tekrar {

    // kullanıcıdan adresini alınız ve ekrana yazdırınız.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" lutfen adresinizi giriniz.");

        String adress = input.nextLine();

        System.out.println(adress);


    }
}
