package practice.pratice_nighttime02;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //Dikdörtgenin alanını hesaplayan kodu yazınız ve kullanınız.

        System.out.println("dikdortgenin alanı: "+ dikdortgenAlani(10, 5));
        System.out.println("dikörtgenin çevresi : " + dikortgenCevre(10, 5));
        kareAlan(10);

    }//main

    /*
    Access      static     datatype         method ismi (parametreler)
    modifier

     */



    public       static       int            dikdortgenAlani(int a , int b){

        return a*b;//çarpmanın sonucunu kullanıcıya verdim

    }

    public static int dikortgenCevre(int a, int b){
        return 2*(a+b);
    }
    //karenin alanını hesaplatan kodu yazınız

    public static void kareAlan(int a){
        System.out.println("karenin alanı : "+ a*a );

    }



}//class
