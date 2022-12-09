package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {

    // javada her karakterin sayısal bir değeri vardır.
    // bu değerler ascii değerler olarak adlandırılır.
    // bu değerlerin tamamının bulunduğu tabloya ASCİİ table denir.

    public static void main(String[] args) {

        //herhangi bir karakterin ascii değerini bulmak için o karakteri int data tipinde bir variable içine koyunuz.

        int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 ='K';
        char c2 ='?';
        // java da char ları mat işlemlerde kullanırsanız java o charların ascii değerlerini kullanır.
        System.out.println(c1+c2);//138


    }
}
