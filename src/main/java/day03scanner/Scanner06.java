package day03scanner;

import java.util.Scanner;

public class Scanner06 {


    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("beş basamaklı bir sayı giriniz");
        int number = input.nextInt();

        //son rakamı al
        // % 10 = modulus ten ==> 10 a bölündüğünde kalanı verir.
        int lastDigit = number%10;
        number = number/10;

        //sondan ikinci kısım
        int lastSecondDigit = number%10;
        number= number/10;

        //sondan üçüncü kısım
        int lastThirdDigit = number%10;
        number = number/10;

        //sondan dördüncu
        int lastFourthDigit  =number%10;
        number = number/10;

        //sondan beşinci rakam
        int firstDigit = number%10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + firstDigit);




    }
}
