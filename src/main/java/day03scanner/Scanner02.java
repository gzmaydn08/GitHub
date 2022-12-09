package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //kullanıcıdan ilk ismini ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminiz giriniz.");
        //next() method kullanıcıdan "tek kelimelik String" almak için kullanılır.
        String firstName = input.next();

        System.out.println("soy isminizi giriniz.");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);

    }

}
