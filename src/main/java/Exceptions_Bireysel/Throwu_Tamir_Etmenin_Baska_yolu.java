package Exceptions_Bireysel;

public class Throwu_Tamir_Etmenin_Baska_yolu  {

    public static void main(String[] args) throws IllegalArgumentException {  //burakadaki deklerasyon aslinda .eger
        // exception i tamire niyetin yoksa bunu yazsanda olur yazmasanda


        ogrencinotunugir(-90);

// Simdi bu metodla alakali iki durum sözkonusu.
        // ya program duracak .exception atacak cunku. Bunu biz istedik.
        // ya da program  aksak aksak devam edecek calismaya.(Bu programi handl etmekle mumkun olur.)
        // Programin calismasini istiyorsak yani handl etmek istiyorsak bunu  sadece try catch ile yapabilirim simdilik
        // Bunu da iki ayri yerde yapabilirim. Ya main icerisinde ya da metod icersinde

        // Simdi gelelim throws'a . Bu throws class isminde yazilir .

        //////////////////////////////EXCEPTION ATMA DISINDA HICBIR SEY APPLICATION I DURDURAMAZZZZZZZZ//////////////////////////
        // BUNDAN DOLAYI SU HATA MEYDANA GELDIGINDE BEN HICBIR SEKILDE UYGULAMAMIN CALISMASINI ISTEMIYORUM DIYORSAN KENDINE
        // UYGULAMAYA EXCEPTION ATTIRRRRRRRRRRRRR:
        // ECXEPTION ATACAK OLAN METODLAR HANDL EDILMELIDIRLER : BU SENARYOYA BAGLI TABIKI


        // YA EXCEPTIONI  AT VE TAMIR ET DEVAM ET
        // YA EXCEPTIONAI AT VE APP I DURDUR DERIZ JAVAYA:
        // EGER TAMIR ETMEYE NIYETIMIZ YOKSA IKI SEKILDE YAPABILIRIZ
        // YA sadece metod badi de throw new yapacaz.
        // Ya da main metoda ekstradan throws  diyecez. Aslinda her iki durumdada zorunlu olan sey
        // body de throws attirmak .

    }

    private static void ogrencinotunugir(int i) {

        if (i < 0) {
            throw new IllegalArgumentException("not sifirdan kucuk olamwwaz");
        } else if (i > 100) {
            throw new IllegalArgumentException("not yüzden büyük olamaz");
        } else {
            System.out.println(i);
        }
    }
}
