package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bingo_oyunu {
    public static void main(String[] args) {


     /*   Oyuncudan 1-10 arasi bir sayi isteyiniz
        Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
        Yoksa verdigi sayiyi listenize ekleyiniz.
                Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz

        [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
        [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
        [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
                */


        Scanner input = new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("5");
        c.add("8");
        c.add("2");
        c.add("9");
        System.out.println("c = " + c);//c =c = [5, 8, 2, 9]
        int sayac=0;

        do {
            System.out.println("lutfen bir sayi girin");
            String sayi = input.next();


            if (c.contains(sayi)) {

                c.set(c.indexOf(sayi), "BINGO");
                sayac++;
            } else {
                c.add(sayi);
            }
            System.out.println(c);

        } while (sayac<c.size());



    }//main
}
