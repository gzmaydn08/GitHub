package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1) bir stringin baş ve sonunda space karakteri varsa siliniz.
        //       "    Ali Can    " ==> "Ali Can"

        String s = "   Ali Can  ";
        System.out.println(s);

        //trim.() methodu bir stringin baş ve sonun da ki space leri siler aradaki space lere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2) Aşağıda fiyatları verilen ürünlerin toplam fiyatını bulunuz.
        //        String tv= "$456.99";   String laptop = "$875.99";  ==> 456.99+875.99=1332.98

        String tv1= "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);//456.99 ==> ondalıklı sayılar javada otomatik olarak double kabul edilir.

        String lapto2 = laptop1.replace("$", "");
        System.out.println(lapto2);//875.99

        Double totelPrice = Double.valueOf(tv2)+ Double.valueOf(lapto2);
        System.out.println(totelPrice);//1332.98

        //Example 3) verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız.
        //          "Ali Can" ==> AC

        String name ="    ali cAN  ";
        char name1 = name.trim().toUpperCase().charAt(0);
        System.out.println(name1);//A

        char name2 = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(name2);//C

        System.out.println(""+ name1 + name2);//AC

        //Example 4) bir stringin hiç karakter içermediğini(boş string) kontrol eden kodu yazınız.

        String str = "";

        //1.yol: length() kullan
        boolean result1 = str.length()==0;
        System.out.println("String boş mu? " + result1);//true

        //2.yol: isEmpty() kullan java bir konuda method üretmişse o methodu kullanmak en iyisidir. ( öncelikli)
        boolean result2 = str.isEmpty();
        System.out.println("String boş mu? " +result2);//true

        //Example 5) bir stringin space hariç hiç karakter içermediğini kontrol eden kodu yazınız.

        String t = "     ";

        //1.yol:
        boolean result3 = t.replace(" ", "").length()==0;
        System.out.println("sadece space mi var? " + result3);//true

        //2.yol:
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("sadece space mi var? " +result4);

        //3.yol:
        //isBlank() methodu sadece space içeren stringler için true verir space dışında bir karakter içerirse false verir.
        //isBlank() methodu  boş stringler içinde true verir.
        //isBlank() ==> space + hiçbir şey için true       isEmpty()==> hiçbir şey için true

        boolean result5=t.isBlank();
        System.out.println("sadece space mi var? " +result5);

        //Example6: bir stringte a, e, i karakterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız.
        //         "java is  easy to learn" ==>1+5+8=14

        String r ="java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);


        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println("indexler toplamı: " + (idxA+idxI+idxE));//indexler toplamı: 14

        //Example 7) bir stringte Java kelimesinin ilk olarak kaçıncı indexlerde kullanıldığını gösteren kodu yazın
        //          "Ah Java vah Java sensiz olmuyor Java."

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullanımında siz java kelimesinin ilk görünümündeki ilk harfin indexini görmüş olursunuz.
        int u1 = u.indexOf("Java");
        System.out.println(u1);//3

        //indexOf() methodu olmayan karakterler için kullanılırsa her zaman -1 verir
        int u2 = u.indexOf("xyz");
        System.out.println(u2);//-1


        //Example 8) bir stringte a,i,e karakterlerinin son görünümlerinin indexleri toplamı nedir.
        //         "java is  easy to learn" ==> 18+5+17=40

        String v = "java is easy to learn";
        int v1 = v.lastIndexOf('a');
        System.out.println(v1);//18

        int v2 = v.lastIndexOf('i');
        System.out.println(v2);//5

        int v3 = v.lastIndexOf('e');
        System.out.println(v3);//17

        System.out.println(v1+v2+v3);//40

        //note: lastIndexOf() stringde olmayan bir karakter için kullanılırsa her zman -1 verir.

        //Example 9) bir stringdeki tekrarsız  karakterleri ekrana yazdırınız.

        String y = "aac";
        char ch1 = y.charAt(0);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);//tekrarlı olduğu için yazdırmaz
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);//tekrarlı olduğu için yazdırmaz
        }

        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);//c
        }


        //          abbccdc ==> ad
        //note:bazı kodların bazı şartlara bağlı olarak çalışması gerekir.
        //     bazı kodları bazı şartlara göre aktife etmek için "if statement" kullanılır.
        //     if you study hard, you will learn Java.


      //EXample 10) sayı çift ise ekrana pozitif yazdırın.

        int num = 12;
        if(num>0){
            System.out.println("Pozitif");//Pozitif
        }


        //EXample 11) sayı -1 ile 10 arasında ise ekrana Rakam yazdırın.

       int number = 3;
        if(number> -1 && number<10){
            System.out.println("Rakam");//Rakam
        }



        //Example 12) sayı üç basamaklı ise wooow yazdırıdn

        int n  = -123;

        n = Math.abs(n);

        if (n>99 && n<1000){
            System.out.println("wooow");
        }






    }
}
