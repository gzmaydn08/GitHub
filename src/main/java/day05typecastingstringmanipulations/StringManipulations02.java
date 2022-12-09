package day05typecastingstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //EXample 1: "s" stringinin money ile bitip bitmedğini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);//true

        //EXample 2: "s" stringindeki money kelimesini dolar kelimesine çeviriniz.
        String s1 =s.replace("money", "dolar");
        System.out.println(s1);//Learn Java earn dolar


        //EXample 3: "s" stringindeki earn kelimesini win kelimesine çeviriniz.
        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

        //EXample 4: "s" stringindeki a harflerini  * e çevirin çeviriniz.
        //note : replace methodunda çoklu karakater ile çalışırsanız mecburen "" kullanılır.
        // eğer tek karakterle çalışırsanız "" veya '' kullanabilirsiniz
        String s3 = s.replace('a','*');
        System.out.println(s3);//Le*rn J*v* e*rn money

        //note: ama ya ikisi de çift tırnak olmalıdır yada ikiside tek tırnak olmalıdır.
        //EXample 5: "s" stringindeki n harflerini  xxx e çevirin çeviriniz.
        String s4 = s.replace("n", "xxx");
        System.out.println(s4);//Learxxx Java earxxx moxxxey

        //EXample 6: "s" stringindeki bütün e harflerini  siliniz.
        //note: hiçbir şey char data type da yoktu bu yüzden
        // replace() methodu kullanarak silme işlemi yaparsanız mutlaka "" kullanınız
        String s5 = s.replace("e","");
        System.out.println(s5);//Larn Java arn mony



        String t = "Ali 13 yasindadir!...";

        //EXample 7: "t" stringindeki bütün  rakamları(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,) * a çeviriniz.
        //bir grup datayı değiştirmek için replaceAll() kullanılır.
        //note:bir grup datayı ifade etmek için "regular expressions"(Regex)kullanılır.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);//Ali ** yasindadir!...

        /*
        Meşhur Regex ler :
        1) tüm rakamlar ==> [0-9]
        2) tüm küçük harfler ==> [a-z]
        3) tüm büyük harfler ==> [A-Z]
        4) tüm harfler ==> [a-zA-Z]
        5) tüm harfler ve rakamlar ==> [a-zA-Z0-9]
        6) tüm noktalama işaretleri ==> \\p{Punct}
        7) tüm sesli harfler ==> [aeiouAEIOU]
           x, q, w harfleri ==> [xqw]

        8) küçük harflerden farklı tüm karakterler ==> [^a-z]
        9)  tüm harflerden farklı tüm karakterler ==> [^a-zA-Z]

        10) space dışındaki tüm karakter ==> \\S
         */

        //EXample 8: "t" stringindeki bütün  rakamları ve harfleri ! yapın
        String t2 =  t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...


        //EXample 9: "t" stringindeki bütün sesli harfleri ? yapın
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...


        //EXample 10: "t" stringindeki küçük harfler dışındakileri "<>" yapın
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //EXample 11: "t" stringindeki tüm harfler dışındakileri "+" yapın
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);//Ali++++yasindadir++++

        //EXample 12: "t" stringindeki spaceler  dışındakileri "+" yapın
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);//+++ ++ ++++++++++++++

        //EXample 13: "t" stringindeki ssesli harfler dışındakileri  dışındakileri "&" yapın
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&








    }

}
