package day03scanner;

import java.util.Scanner;

public class Scanner02Tekrar {

    //kullanıcıdan ilk ismini ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz.");

        String firstName = input.next();

        System.out.println("soy isminizi giriniz.");

        String lastName = input.next();

        System.out.println(firstName+" "+ lastName);

    }
}
