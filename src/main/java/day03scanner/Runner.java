package day03scanner;

public class Runner {

    public static void main(String[] args) {

        //object nasıl oluşturulur.
        // class ismi yazılır Car
        // objeye isim verilir. myCar
        // atama operatörü "=" koyulur =
        // new keyword yazılır. new
        // constructor yazılır. Car()


        Car myCar = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.fiyat);

        myCar.hareket();
        myCar.dur();



        Student tomHanks = new Student();

        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);

        tomHanks.study();
        tomHanks.feed();


    }
}
