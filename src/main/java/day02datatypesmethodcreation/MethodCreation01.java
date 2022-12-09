package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    javada method nasıl oluşturulur.
    1) main methodun dışında oluşturulur.
    2)Access Modifier + Return Type + Method İsmi + () + {}

    Oluşturulan methodlar nasıl kullanılır?
    1) main methodun içinden kullanılır.
    2)methodun ismini yazın + ()
    3)işlem yapacağınız sayıları parantezin içine koyun
    4)


     */

    public static void main(String[] args) {
        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println(ucluSonuc);

        double kup = getCube(5);
        System.out.println(kup);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    protected static long multiply(long a, int b) {
        return a * b;
    }


// verilen üç sayıda ilk ikisini çarpan üçüncü ile toplayan mrthodu oluşturunuz

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }

    // verilen bir ondalık sayının küpünü hesaplayan methodu oluşturun
    // access modifier i defoult yapmak için hiçbir şey yazılmaz

    static double getCube(double a) {
        return a * a * a;
    }
        // dikdörtgenin alanını hespalayan method
        // diktörtgenin çevresini
        // dairenin çevresini hesaplayan
        // dairenin alanını hesaplayan method
}