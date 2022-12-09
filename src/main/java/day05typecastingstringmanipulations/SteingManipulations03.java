package day05typecastingstringmanipulations;

import java.util.Scanner;

public class SteingManipulations03 {
    public static void main(String[] args) {


        /*
        EXAMPLE1:aşağıdaki kurallara göre kullanıcıların girdiği passwordu kontrol edin.
        1) en az 8 karakter olsun
        2)space karakter passwordde olmasın
        3)en az bir tane büyük harf olsun
        4)en az bir tane küçük harf olsun
        5)en az bir tane sembol olsun
        6)en az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen passwordünüzü giriniz...");
        String pwd = input.nextLine();

        //1) en az 8 karakter olsun
        boolean first = pwd.length()>7;
        System.out.println(first);

        //2)space karakter passwordde olmasın
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //3)en az bir tane büyük harf olsun
        //note: büyük harf olmayanları sil
        //     kalan karakter sayısına bak
        //     karakter sayısı sıfır ise büyük harf yok demektir.
        //     sıfırdan büyük ise büyük harf vardır.
        boolean third = pwd.replaceAll("[^A-Z]", "").length()>0;//Methodları aynı satırda yan yana kullanmaya method chain denir.
        System.out.println(third);

        //4)en az bir tane küçük harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(fourth);

        // 5)en az bir tane sembol olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println(fifth);

        //6)en az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);


        System.out.println("password geçerli mi?"+" "+ (first && second && third && fourth && fifth && sixth));//sadece bu yazılsa olur.




    }
}
