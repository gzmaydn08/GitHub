package practice.pratice_nighttime02;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        /*
        Teachproed spor salonu için kullanıcıdan
        isim soyisim yaş kilo boy salona devam edeceği ay süresi bilgilerini alıp
        aylık 20$ olarak toplam ücreti yazdırırnız.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("TechproEd spor salonuna hoşgeldiniz.....");
        System.out.println("lütfen isminizi giriniz.....");

        String name = input.nextLine();

        System.out.println("lütfen yaşınızı giriniz....");
        byte age =input.nextByte();

        System.out.println("lütfen kilonuzu giriniz....");
        double weght = input.nextDouble();

        System.out.println("lütfen boyunuzu giriniz....");

        double boy= input.nextDouble();

        int aylikUcret = 20;
        System.out.println("aylikUcret = " + aylikUcret + "$");
        System.out.println("lütfen üyelik süresini giriniz.....");

        int aylik = input.nextInt();


        int toplamTutar = aylikUcret * aylik;

        System.out.println("toplamTutar + \"$\" = " + toplamTutar + "$");

        System.out.println("isim = " + name + "\nyaş"+ age + "\nkilo"+weght+ "\nboy"+boy+ "\nödemeniz gereken toplam tutar"+toplamTutar+"$");









    }

}
