package Bireysel____Denemeler;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Anagram_sorusu {


    public static void main(String[] args) {






        /*
       İki kelimenin "Anagram" olup olmadığını kontrol eden bir method oluşturunuz.
       - Anagram, başka bir kelimenin karakterlerinden yeni bir kelime oluşturmaktır. -
       Örn:
       * bahriyeli <> harbiyeli.
       * sızlanma <> anlamsız.
       * asya <> yasa.
       * Bursa Dağı <> su bardağı
       * kan ara <> Ankara.
       */

        System.out.println("lutfen birinci kelimeyi giriniz");
        Scanner input = new Scanner(System.in);
        String ilk_kelime = input.next();
        System.out.println("ikinci kelime ");
        String ikinci_kelime = input.next();

        String ilk_kelime1[] = ilk_kelime.split("");
        String ilk_kelime2[] = ikinci_kelime.split("");

        Arrays.sort(ilk_kelime1);
        Arrays.sort(ilk_kelime2);

        if (Arrays.equals(ilk_kelime1,ilk_kelime2)) {

            System.out.println("Anagram yazilar");

        } else {
            System.out.println("anagram degiller");
        }




    }//Main
}//class
