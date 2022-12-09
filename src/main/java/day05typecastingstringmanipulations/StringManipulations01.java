package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data type dir aynı zamanda bir classtır.


    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1) "s" stringinde ki tüm characterleri büyük harf yapınız.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Example 2) "s" stringinde ki tüm characterleri küçük harf yapınız.

        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy


        //Example 3) "s" stringinde ki ilk characteri alınız

        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Example 4) "s" stringinde ki ikinci ve sondan 2.  characteri alınız ve ekrana yan yana yazdırınız.

        char secondChar = s.charAt(1);//a
        char tenChar = s.charAt(10);//s

        //1.YOL: aynı satırda yazdırmak için
        System.out.print(secondChar);
        System.out.println(tenChar);

        //2.YOL:aynı satırda yazdırmak için
        System.out.println("" + secondChar + tenChar);

        //Example 5) "s" stringinde kullanılan karakter sayısını bulunuz.
        int sLength = s.length();
        System.out.println(sLength);//12


        //Example 6) "s" stringinde kullanılan ilk 4 karakteri alınız
        //substring(0,4)==>"0" yani ilk index dahil "4" yani ikinci index haricdir.(0,4)

        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Example 7) "s" stringinde kullanılan is kelimesini alınız
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Example 8) "s" stringinde kullanılan easy kelimesini alınız

        String sub3= s.substring(8,12);
        System.out.println(sub3);

        // bir karakterden başlayıp stringin sonuna kadar almak isterseniz ikinci indexi yazmayınız
        //s.substring(8,12) ==> s.substring(8) yazılır.
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 9) "s" stringinde "money" kelimesinin olup olmadığını kontrol ediniz.
        boolean isExist = s.contains("money");//false
        System.out.println(isExist);

        boolean isExist1 = s.contains("Easy");//false
        System.out.println(isExist1);

        boolean isExist2 = s.contains(" ");//true
        System.out.println(isExist2);

        /*
        Bir methodu öğrenirken üçşeyi mutlaka öğreninin
        1) bu method ne iş yapar?
        2) bu methodun farklı kullanımları nasıldır?
        3) bu method size ne return eder?
         */

        //Example 10) "s" stringinin belli bir harfle başlayıp başlamadığını kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        boolean isStart1 = s.startsWith("J");
        System.out.println(isStart1);//true

        //Example 11) "s" stringinin 6. character den itibaren belli bir harfle başlayıp başlamadığını kontrol ediniz.
        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);//true















    }
}
