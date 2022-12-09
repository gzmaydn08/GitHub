package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
    numeric primitive data typelarının birbirine dönüştürülmesine "type casting" denir.
    numeric data type : byte - short - int - long - float - double

    note 1: küçük data type larını büyük data type larına çevirmeyi java otomatik olarak yapabilir.
            bu işleme "AutoWidening" denir.(otomatik genişletme)

    note 2: büyük data type larını küçük data typelarına çevirmak riskli bir iştir. java bu riskli işi otomatik olarak yapmaz.
            bu işlemi kod yazanlar yapar.
            bu işleme "ExplicitNarrowing" denir.(açıktan daraltma)


     */

    public static void main(String[] args) {

        //byte data type ini int data type a çeviriniz.
        byte age = 13;
        int ageInt = age;// AutoWidening

        // long data type i short data type a çevirelim
        long weight = 234;
        short weightShort =(short) weight;// ExplicitNarrowing

        //int data type i float a çeviriniz

        int population = 700000;

        System.out.println(population);

        float populationFloat = population;

        System.out.println(populationFloat);

        // double data type ı short a çeviriniz.

        double number = 12.234;
        System.out.println(number);//12.234

        short numberShort =(short) number;
        System.out.println(numberShort);//12

        // DİKKAT!:dönüşüm yaptığınız sayı (260) dönüşeceğiniz data type inin sınırları dışında ise java
        //kullandığınız sayı ile "mod" işlemi yapar ve mod işleminin sonucu sizin yeni değeriniz olur(4)
        // example 1:
        short num = 260;
        System.out.println(num);//260

        byte numByte =(byte) num;
        System.out.println(numByte);//4

        //example 2 :
        short n = 1023;
        System.out.println(n);//1023
        byte nByte =(byte) n;
        System.out.println(nByte);//-1










    }
}
