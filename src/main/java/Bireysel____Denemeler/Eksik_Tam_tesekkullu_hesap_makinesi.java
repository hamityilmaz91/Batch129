package Bireysel____Denemeler;

import java.util.Scanner;

public class Eksik_Tam_tesekkullu_hesap_makinesi {
    public static void main(String[] args) {

        System.out.println("hesap makinesi programidir \n bu programda sinirsiz sayida islem  yapabilirsiniz");
        System.out.println("lutfen baslangicta yapmak istediginiz islemi seciniz");
        System.out.println("+,,,,,-,,,,,,*,,,,,/   tuslarindan birine basiniz");
        Scanner input = new Scanner(System.in);
        char islem= input.next().charAt(0);

        switch (islem){

            case '+':
                toplama();
                break;
            case '-':
                cikarma();
                break;
            case'*':
                carpma();
                break;
            case '/':
                bolme();
                break;
        }




    }//main

    private static void bolme(int...sayi2) {
        System.out.println("hicbir sayi sifira bolunemedigi icin sifirdan farkli deger giriniz");
        double bolme = sayi2[0]/sayi2[1];
        for (int i = 2; i < sayi2.length; i++) {

            bolme=bolme/sayi2[i];
        }
        System.out.println("bolme isleminin sonucu = "+bolme);
    }

    private static void carpma(int...a) {

        int carpim = 1;
        for (int i : a) {
            carpim=carpim*i;

        }
        System.out.println("sayilarin carpimi = "+carpim);
    }

    private static void cikarma(int...a) {

        int fark=0;
        for (int i : a) {
            fark=fark-i;

        }
        System.out.println("sayilarin farki = "+fark);
    }

    private static void toplama(int...a) {

        int toplam=0;
        for (int i : a) {
            toplam=toplam+i;

        }
        System.out.println("sayilarin toplami = "+toplam);
    }
}//class
