package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.List;

public class Indirim_metodu_olusturma {

    public static void main(String[] args) {

    //    100 tl ye satilan bir urun icin iki farkli indirim uygulayan iki metod yaziniz

       int pantolon=100;

        System.out.println("ilkindirim(pantolon) = " + ilkindirim(pantolon));
        System.out.println("ikinciindirim(pantolon) = " + ikinciindirim(pantolon));

        System.out.println(pantolon);




    }//main

    private static int ikinciindirim(int pantolon) {

        pantolon=pantolon-15;
        return pantolon;
    }//metod1

    private static int  ilkindirim(int pantolon) {


        pantolon=pantolon-25;

    return pantolon;




    }//metod2




}//class
