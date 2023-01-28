package Exceptions_Bireysel;

import Farkli_Konstraktir.A;

import java.util.Scanner;

public class Bizim_olusturdugumuz_2 {

    public static void main(String[] args) {

        int a = 735;

        try {
            notgirme(a);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());// burda get messege da hangi exception objesini olusturdu isen
            // onun mesajini gorursun.//// birde ellegal yerine Exceptions e de yazabilirsin.
            //Ama Aritmeitk exception yazamazsin
        }


    }
// sadece if ile sout yaziyoruz.
    // digerinde if throw(ayni sout )  yaziyoruz.
    // ikisinin ekranindada ayni seyleri gorebiliriz evet ama ,, ifte  girdigi blokta kac tane kod varsa hepsini okut.
    // throwlu if blogunda bloktaki kodlarin tamami okunmayabilir. eger throwu en asagiya yazmadiysam throw u
    // gordugu yerde program durur.
    private static void notgirme(int a) {

        if (a < 0) {
            throw new IllegalArgumentException("yanlis kucuk not girdiniz");
        } else if (a > 0) {
            throw new IllegalArgumentException("yanlis buyuk not girdiniz");
        } else {
            System.out.println(a);
        }

    }
}
