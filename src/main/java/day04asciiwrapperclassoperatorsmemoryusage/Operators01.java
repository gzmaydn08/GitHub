package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

    public static void main(String[] args) {

        /*
        1) + , -, *, / işlemleri javada matematikte kullanıldığı gibi kullanılır.
        note: int / int ==> int
        note2: double / int ==> double çünkü javada da mat işlemlerinde farklı data tipleri kullanılırsa sonuç büyük data tipinde olur.

        2) javada "logical operatör" lar vardır.
        AND(&&) ve OR(||) işlemleri "logical operatör" lardır.
        AND de bir false varsa sonuç false dır.
        OR da bir tane true olması yeterlidir.

        3) NOT(!) operatörü true olanı false, false olanı true yapar.
        !true = false
        !false= true
        !!true = true

        4)comparison (karşılaştırma) operatörleri <, >, <=, >=, ==, !=
        note: karşılaştırma operatörlerini kullandığınızda kesinlikle boolean(true-false) alırsınız.

        note: biz AND işlemi için "&&" kullanırız ama "&" da geçerlidir.
              farkları nedir?
              "&&" bu kullanım ilk ifade false olduğunda diğerlerini kontrol etmez dolayısıyla hızlı çalışır
              "&" kullanımmı ilk ifade ne olursa olsun diğerlerini kontrol eder dolayısıyla yavaş çalışır.
              bu yüzden biz hep "&&" kulanırız.

         */

        boolean first = 3<5;// true
        boolean second = 2+3!=5;// false
        boolean third = 2+3*5 >= 19;// false

        System.out.println(first+"-"+ second + "-" + third);// true-false-false

        System.out.println(first && second);// false

        System.out.println(first||second||third);// true



    }
}
