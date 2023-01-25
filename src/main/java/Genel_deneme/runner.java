package Genel_deneme;

import Farkli_Konstraktir.C;

public class runner {

    public static void main(String[] args) {


        Cocuk obj = new Cocuk();
        System.out.println(obj.a);   // cocuktaki
        obj.toplama();              // cocuktaki

        Parent obj2 = new Cocuk();      //babadaki
        System.out.println(obj2.a);     //cocktaki
        obj2.toplama();
    }
}
