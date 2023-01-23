package Bireysel____Denemeler;

public class Araba_klasi_anlamak_icin {


    String make ="Honda";
    String model ="Accord";
    int jear = 2022;
    boolean hybrid= true;




    Araba_klasi_anlamak_icin(String A, String B, int yil, boolean yakit){

        this.make= B;
        this.model=A;
        this.jear=yil;
        this.hybrid=yakit;


        /////// Class icerisindeki variabler sayilarinin kombinasyon sayisi kadar obje olusturabilir.
        ////Buraya metod ekleyince muhtemelen metodlarin sayilarinin kombinasyonlari da isin icerisine girecektir .


        //////// METODDAKI GIBI GELEN SEYLERIN SIRASININ BIR ONEMI YOK. Bana kullancagim degerler geliyor .Istegidimi istedigim
        // degiskene atayabilirim. hatta iki tane farkli string ginderdim mesela . sadece birini kullnamk istedi canim.
        //birini begenmedim. o zaman sadece begendigimi  programdaki tum string degerlere atayabilirim.

        ////STRING CLASSS METODLARIN STRING BUILDER CLASSTA KULLANILDIGINDA   ;;BUILDERCLASSTA OLAN DEGISKENIN ORIJINAL DEGERI KORUNUR:
        // BU NEDEN ELZEM: STRINBUILDER CLASSTA OLAN METOD BULDER STRINGINE UYGULANDIGI ZAMAN BUILEDER STRINGI ANINDA DEGISIR
        // AMA BUILDERA NORMAL STRING CLASS METODU UYGULANIRSA BUILDERDAKI STRING DEGERI DEGISMEZ.


    }//constrakter parantezi

    public Araba_klasi_anlamak_icin(String n, String m, int jear) {
        this.make = n;
        this.model = n;
        this.jear = jear;
    }



    @Override
    public String toString() {
        return "Araba_klasi_anlamak_icin{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", jear=" + jear +
                ", hybrid=" + hybrid +
                '}';
    }

}// class
