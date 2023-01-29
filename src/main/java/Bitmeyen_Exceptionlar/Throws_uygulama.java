package Bitmeyen_Exceptionlar;

import java.util.Scanner;

public class Throws_uygulama {


    public static void main(String[] args) throws Benim_Compiletime_Exceptionim {


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ogrencinin notunu giriniz ");
        int sayi = input.nextInt();

        if (sayi<0){

            throw new Benim_Compiletime_Exceptionim("sayi sifirdan kucuk olamaz");

        }else{
            System.out.println(sayi);
        }


// throws compile time exceptiona handl ediyor ama sonrasinda run time i handl etmiyor . eger istisnalar iicnde
        // calismasini istiyorsak run time exception illaki handl edilmeli

    }
}
