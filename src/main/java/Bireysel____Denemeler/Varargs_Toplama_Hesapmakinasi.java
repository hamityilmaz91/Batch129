package Bireysel____Denemeler;

public class Varargs_Toplama_Hesapmakinasi {

    public static void main(String[] args) {

        String sonuc="sonuc";

      toplama(sonuc,3,3,4,5,6,77,6,63,3,5);

    }//main metod


    // varargslar sadece  metodlarda mi kullanirlir
// metodlar main metod icerisinden  cagrilirlar
//sonsuz parmetre gondermek ivin varargslar kullarinit


    private static void toplama(String sonuc, int... a) {
        int toplam = 0;

        for (int w : a) {
        toplam=toplam+w;

        }
        System.out.println(sonuc+"="+toplam);

    }
}//class parantezi




