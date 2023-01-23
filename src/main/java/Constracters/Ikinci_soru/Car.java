package Constracters.Ikinci_soru;

public class Car extends Vehicle {
    public int price = 11000;

    public Car() {                               // BIRINCI KONSTRAKTIR
        super(20000);
        int m = 12;
        int y = 12;
        int toplam = m + y;
        System.out.println(toplam);
        System.out.println("Car 1");
    }

    public Car(String make) {
        this();
        System.out.println(make);               // IKINCI KONSTRAKTIR

    }

    public static void main(String[] args) {


        Car obj = new Car();
    }

}
