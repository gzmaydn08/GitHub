package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        //Example 1: Ay isimleri girilince kaçıncı ay olduğunu yazan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ay ismi giriniz...");
        String monthName =  input.next();

        if(monthName.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if (monthName.equalsIgnoreCase("fabruary")){
            System.out.println(2);
        }else if (monthName.equalsIgnoreCase("march")){
            System.out.println(3);
        }else if (monthName.equalsIgnoreCase("april")){
            System.out.println(4);
        }else if (monthName.equalsIgnoreCase("may")){
            System.out.println(5);
        }else if (monthName.equalsIgnoreCase("june")){
            System.out.println(6);
        }else if (monthName.equalsIgnoreCase("july")){
            System.out.println(7);
        }else if (monthName.equalsIgnoreCase("august")){
            System.out.println(8);
        }else if (monthName.equalsIgnoreCase("september")){
            System.out.println(9);
        }else if (monthName.equalsIgnoreCase("october")){
            System.out.println(10);
        }else if (monthName.equalsIgnoreCase("november")){
            System.out.println(11);
        }else if (monthName.equalsIgnoreCase("december")){
            System.out.println(12);
        }else {
            System.out.println("invalid month name.....");
        }

        //note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
        //      Niye ?
        //      Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
        //      ikisi de ayni ise siz String'ler esittir der ama biz code yazarken genellikle String'lerin
        //      adres'leri ile degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.
        //
        //      "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
        //      bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
        //      ihtiyac duydugumuz seydir.


        String s = "tom";
        String t = "terry";
        String r = new String("tom");
        String m = "tom";
        System.out.println(s==t);//false çünkü adressler ve değerler farklı
        System.out.println(s.equals(t));//false çünkü değerler farklı

        System.out.println(s==r);//false çünkü adresler farklı
        System.out.println(s.equals(r));//true çünkü equals method sadece değerlere bakar s ve r nin değerleri aynı olduğundan true verir.
        System.out.println(s==m);//true
    }

}
