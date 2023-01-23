package Constracters.Anlama_sorusu;

public class Dog extends Mammal{

    public boolean bark =true;

    public static void main(String[] args) {

        Mammal dog = new Dog();


        System.out.println(dog.fead);
        System.out.println(dog.weight);




        // child klaslardan uretilen nesnelerden ,en fazla sayida degisken görebiliriz.
        // bir class disa bagimli  degilse yani extendi yoksa yalnizsa o klastan olusturulacak nesne
        // mecburen   A KLAS  OBJE = NEW  A KLAS OLMAK ZORUNDA :
        //AMA INHERITENS OLAYI VARSA
        //      A KLAS   OBJE = NEW   Z KLAS  YAZILABILIR :    TEK KURAL    A>Z OLACAK


    }

}
