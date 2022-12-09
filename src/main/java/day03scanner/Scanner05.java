package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //kullanıcıdan bir dikdortgenin iki kenar uzunluğunu alınız.
        //1)alanını hesaplayınız > kısa kenar*uzun kenar
        //2)çevresini hesaplayınız > 2*kısa+2*uzun

        Scanner input = new Scanner(System.in);

        System.out.println("dikdörtgenin kısa kenar uzunluğunu giriniz.");
        float shortSide = input.nextFloat();

        System.out.println("dikdörtgenin uzun kenarını giriniz.");
        float longSide = input.nextFloat();

        System.out.println("Alan = " + shortSide * longSide);

        System.out.println("çevre = " + (2*shortSide + 2*longSide));







        }
}
