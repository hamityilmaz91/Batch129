package Exceptions_Bireysel.Class_cast_exception;

import java.util.Scanner;

public class Usalma {

    // bir sayinin istenen kuvvetini hesaplama

    public static void main(String[] args) {


        int sayi = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("sayininn kacinci kuvvetini  akmak istiyorsuu?");
        int kere = input.nextInt();
        int carpim=1;
        for(int i =1;i<kere;i++){

           carpim= sayi*carpim;

        }
        System.out.println(carpim);
    }
}
