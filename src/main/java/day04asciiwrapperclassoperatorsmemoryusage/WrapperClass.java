package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive:        char-    boolean -  byte-  short-  int-   long-  float-  double
        //wrapper class:: Character -Boolean -  Byte - Short- Integer- Long - Float -Double
        //wrapper classlar non-primitive dir. o yüzden memory de çok yer kaplarlar.
        // bu yüzden şart değilse wrapper class kullanmayı tercih etmeyiz

        int n = 12;// "n" yazıp nokta koyarsanız hiç method göremezsiniz , çünkü primitiveler method içermez.
        Integer m = 12;//"m" yazıp nokta koyarsanız bir çok method görürsünüz , çünkü wrapperlar method içerir.

        byte p= 23;
        Byte r= 43;

        //Example 1: short data type ının minimum  ve max değerlerini kod yazarak bulunuz.

        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);//32767

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);//-32768

        // exmple 2 : int min ile byte max ı topla

        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt);

        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);

        System.out.println(minInt+maxByte);//-2147483521

        // example 3: primitive inti wrapper integera çevirirniz.(autoboxing)

        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22

        // example 4: wrapper byte i primitive çeviriniz.(unboxing)

        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);//43

        // example 5: primitve char ı character e çeviriniz.
                    //  wrapper booelan ı primitve e

        char c = 'A';

        Character cWrapper = c;
        System.out.println(cWrapper);


        Boolean isOld = true;

        boolean isOldWrapper = isOld;

        System.out.println(isOldWrapper);

        //example 6: size string olarak verilen iki fiyatın toplamını ekrana yazdırınız

        String shirt = "2300";
        String shoes = "5200";

        System.out.println(shirt+shoes);//23005200

        int toplamFiyat =  Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat);

        // java da + sembolu iki sayı arasındaysa toplama işlemi olur
        // + sembollu iki string veya bir string ve bir sayı arasınsa kullanılırsa "concatenation işlemi" denir
        //concatenation işlemlerinde java matematikteki işlem önceliği kurallarını kullanır.

        String s = "j";
        int sayi = 5;
        int sayi1 = 12;
        System.out.println(s+sayi+sayi1);//j512

        String harf = "k";
        int uc = 3;
        int bes = 5;
        System.out.println(harf + uc*bes);//k15

        //example 7: size string olarak verilen ikş fiyatın toplamını yazdırın
        // valueOf() methodu tüm karakterleri rakam olan stringleri sayılara çevirir.
        //eğer bu method kullanılırken stringin içine sayı olmayan bir karakter kullanırsanız hata alırsınız.
        // bu hatayı düzeltmeyi ileride öğreneceğiz
        String tv = "$11000";
        String radio = "$3000";
        System.out.println(tv+radio);//$11000$3000
        int totalPrice =  Integer.valueOf(tv)+ Integer.valueOf(radio);//HATA






    }

}
