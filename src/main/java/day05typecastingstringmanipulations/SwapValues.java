package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: yer değiştirmek demektir. 1. kap: patates  2.kap: domates ==> 1. kap:domates  2.kap: patates


    public static void main(String[] args) {

        int a =12;
        int b = 5;// swapten sonra ==> a=5 b=12
        int temp = 0;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        //1.YOL
        //1. adım
        temp = a;

        //2.adım
        a = b;

        //3.adım
        b = temp;

        System.out.println("a:"+ a);
        System.out.println("b:"+ b);


        //2.YOL
        int x =12;
        int y =5;

        System.out.println("x:" + x);
        System.out.println("y:" + y);

        x=x+y;

        y=x-y;

        x=x-y;

        System.out.println("x:" + x);
        System.out.println("y:" + y);



    }
}
