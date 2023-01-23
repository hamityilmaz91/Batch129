package Metodoverriding;

public class Cat extends Mammal {

    public void meow(){

        System.out.println("Cats meow");
    }

    @Override  // Override annotation// kontrol mekanizmasidir
    public void eat() {
        System.out.println("Cats  eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");

    }

    @Override
    public Animals sleep() {
        return new Cat();
    }

}



