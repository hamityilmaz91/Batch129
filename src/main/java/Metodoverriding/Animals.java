package Metodoverriding;

public class Animals {

    public static void main(String[] args) {

    }
    public void eat() {
        System.out.println("Animals eat ...");
    }


    public void drink() {

        System.out.println("Animals drink...");
    }


    public Animals sleep() {      // KONSTARAKTIRLA  METODU SADECE RETURN TYPE INDAN AYIRT EDEBILIRZ


        return new Animals();

    }


}



